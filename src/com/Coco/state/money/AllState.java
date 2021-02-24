package com.Coco.state.money;

//各种具体状态类
class FeeBackState extends AbstractState {
    @Override
    public String getCurrentState() {
        return StateEnum.FEED_BACKED.getValue();
    }
}

class GenerateState extends AbstractState {
    @Override
    public void checkEvent(Context context) {
        context.setState(new ReviewState());
    }

    public void checkFailEvent(Context context) {
        context.setState(new FeeBackState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.GENERATE.getValue();
    }
}

class NotpayStaet extends AbstractState {
    @Override
    public void payOrderEvent(Context context) {
        context.setState(new PaidState());
    }

    @Override
    public void feedBackEvent(Context context) {
        context.setState(new FeeBackState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.NOTPAY.getValue();
    }
}


class PaidState extends AbstractState {
    @Override
    public void feedBackEvent(Context context) {
        context.setState(new FeeBackState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.PAID.getValue();
    }
}

class PublishState extends AbstractState {
    @Override
    public void acceptOrderEvent(Context context) {
        context.setState(new NotpayStaet());
    }

    @Override
    public void notPeopleAcceptEvent(Context context) {
        context.setState(new FeeBackState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.PUBLISHEN.getValue();
    }
}


class ReviewState extends AbstractState {
    @Override
    public void makePriceEvent(Context context) {
        context.setState(new PublishState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.REVIEW.getValue();
    }
}