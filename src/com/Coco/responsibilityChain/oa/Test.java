package com.Coco.responsibilityChain.oa;

public class Test {
    public static void main(String[] args) {
        //创建请求
        PurchaseRequest purchaseRequest = new PurchaseRequest(0, 2237, 59);
        //PurchaseRequest purchaseRequest = new PurchaseRequest(1, 6437, 24);
        //PurchaseRequest purchaseRequest = new PurchaseRequest(2, 23467, 25);
        //PurchaseRequest purchaseRequest = new PurchaseRequest(3, 374464, 36);

        //创建相关的审批人
        Approver approver1 = new DepartmentApprover("张主任");
        Approver approver2 = new ColleagueApprover("李院长");
        Approver approver3 = new ViceSchoolMasterApprover("付副校长");
        Approver approver4 = new SchoolMasterApprover("王校长");

        //设置各个级别的审批人(设置成环状), 防止直接给高层的审批人处理
        approver1.setApprover(approver2);
        approver2.setApprover(approver3);
        approver3.setApprover(approver4);
        approver4.setApprover(approver1);

        approver4.processRequest(purchaseRequest);
    }
}
