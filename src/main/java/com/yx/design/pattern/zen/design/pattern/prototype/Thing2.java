package com.yx.design.pattern.zen.design.pattern.prototype;

import java.util.ArrayList;

/**
 * 浅拷贝
 * @author yangxian007
 * @date 2024/2/20
 */
public class Thing2 implements Cloneable {
    // 定义一个私有变量，是引用类型的
    private ArrayList<String> arrayList = new ArrayList<String>();

    @Override
    public Thing2 clone() {
        Thing2 thing2 = null;
        try {
            thing2 = (Thing2) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing2;
    }

    public void setValue(String value) {
        this.arrayList.add(value);
    }

    public ArrayList<String> getValue() {
        return this.arrayList;
    }
}
