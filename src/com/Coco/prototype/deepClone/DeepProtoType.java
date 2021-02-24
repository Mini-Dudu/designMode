package com.Coco.prototype.deepClone;

import java.io.*;

public class DeepProtoType implements Serializable, Cloneable {
    //属性
    public String name;
    public DeepCloneableTarget deepCloneableTarget;

    //构造器
    public DeepProtoType() {
        super();
    }

    //深拷贝-方式1, 使用 clone() 方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object DeepProtoType = null;

        //先完成基本数据类型的克隆;
        DeepProtoType = super.clone();

        //将克隆后的 DeepProtoType 强转为 本类对象类型
        DeepProtoType deepProtoType = (DeepProtoType)DeepProtoType;

        //然后单独出来本类中的引用类型
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget)deepCloneableTarget.clone();

        return deepProtoType;
    }

    //深拷贝-方式2, 通过对象的序列化实现
    public Object deepClone()  {
        //对象输出流
        ObjectOutputStream oos = null;
        //字节数组输出流
        ByteArrayOutputStream bos = null;
        //对象输入流
        ObjectInputStream ois = null;
        //字节数组输入流
        ByteArrayInputStream bis = null;

        try {
            //序列化操作
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);//当前这个对象以对象流的方式输出

            //反序列化操作
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType)ois.readObject();
            return copyObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            //关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }
        }
    }
}
