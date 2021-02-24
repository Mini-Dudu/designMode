package com.Coco.state.money;

public enum StateEnum {
    FEEBACK{
        public String getValue() {
            return "FEEBACK";
        }
    },
    GENERATE{
        public String getValue() {
            return "GENERATE";
        }
    },
    NOTPAY{
        public String getValue() {
            return "NOTPAY";
        }
    },
    PAID{
        public String getValue() {
            return "PAID";
        }
    },
    PUBLISHEN{
        public String getValue() {
            return "PUBLISHEN";
        }
    },
    REVIEW{
        public String getValue() {
            return "REVIEW";
        }
    },
    FEED_BACKED{
        public String getValue() {
            return "FEED_BACKED";
        }
    };

    public abstract String getValue();
}
