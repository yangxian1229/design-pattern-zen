package com.yx.design.pattern.zen.design.pattern.prototype;

import java.util.ArrayList;

/**
 * @author yangxian007
 * @date 2024/2/20
 */
public class Thing4 implements Cloneable{
    // 定义一个私有变量，是引用类型的
    private final ArrayList<String> arrayList = new ArrayList<String>();

    @Override
    public Thing4 clone() {
        Thing4 thing4 = null;
        try {
            thing4 = (Thing4) super.clone();
            // 当 arrayList 是不可变的时候，深拷贝不了哦
           // thing4.arrayList = (ArrayList<String>) this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing4;
    }

    public void setValue(String value) {
        this.arrayList.add(value);
    }

    public ArrayList<String> getValue() {
        return this.arrayList;
    }
}

