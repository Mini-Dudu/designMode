package com.Coco.prototype.deepClone;

import java.io.Serializable;

public class DeepCloneableTarget implements Serializable, Cloneable {
    private static final long serialVersionUID = 1l;

    private String cloneName;

    private String cloneClass;

    //构造器, 因为本类的属性都为基本数据类型, 因此这里使用
    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneClass = cloneClass;
        this.cloneName = cloneName;
    }

    //因为本类的属性都为基本数据类型, 因此这里使用默认的 clone() 完成即可
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
