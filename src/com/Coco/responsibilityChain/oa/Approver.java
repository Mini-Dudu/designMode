package com.Coco.responsibilityChain.oa;

//审批人
public abstract class Approver {
    //下一个处理者
    Approver approver;

    //名字
    String name;

    //构造器
    public Approver(String name) {
        this.name = name;
    }

    //设置下一个处理者
    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    //处理请求的方法, 得到一个请求, 处理是子类完成, 因此为抽象方法
    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
