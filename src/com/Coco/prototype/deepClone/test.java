package com.Coco.prototype.deepClone;

public class test {
    public static void main(String[] args) throws Exception {
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.name = "Coco";
        deepProtoType.deepCloneableTarget = new DeepCloneableTarget("嘟嘟", "人类");

        //方式1完成深拷贝
//        DeepProtoType deep = (DeepProtoType) deepProtoType.clone();
//
//        System.out.println("deepProtoType: " + deepProtoType.name + " " + deepProtoType.deepCloneableTarget.hashCode());
//        System.out.println("deep: " + deep.name + " " + deep.deepCloneableTarget.hashCode());

        //方式2
        DeepProtoType deep = (DeepProtoType) deepProtoType.deepClone();

        System.out.println("deepProtoType: " + deepProtoType.name + " " + deepProtoType.deepCloneableTarget.hashCode());
        System.out.println("deep: " + deep.name + " " + deep.deepCloneableTarget.hashCode());
    }
}
