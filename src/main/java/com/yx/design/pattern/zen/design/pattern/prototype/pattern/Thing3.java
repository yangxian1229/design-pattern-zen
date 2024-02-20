package com.yx.design.pattern.zen.design.pattern.prototype.pattern;

import java.util.ArrayList;

/**
 * 深拷贝
 * @author yangxian007
 * @date 2024/2/20
 */
public class Thing3 implements Cloneable{
    // 定义一个私有变量，是引用类型的
    private ArrayList<String> arrayList = new ArrayList<String>();

    @Override
    public Thing3 clone() {
        Thing3 thing3 = null;
        try {
            thing3 = (Thing3) super.clone();
            // 将arrayList也拷贝一份，但是一般不建议深拷贝和浅拷贝混合使用，为什么？
            // 因为深拷贝和浅拷贝混合使用，会导致对象的引用混乱，不利于维护
            thing3.arrayList = (ArrayList<String>) this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing3;
    }

    public void setValue(String value) {
        this.arrayList.add(value);
    }

    public ArrayList<String> getValue() {
        return this.arrayList;
    }
}
