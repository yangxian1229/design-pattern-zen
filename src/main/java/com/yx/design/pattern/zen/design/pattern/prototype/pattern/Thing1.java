package com.yx.design.pattern.zen.design.pattern.prototype.pattern;

/**
 * 简单的可拷贝对象
 * @author yangxian007
 * @date 2024/2/20
 */
public class Thing1 implements Cloneable {
    public Thing1() {
        System.out.println("构造函数被执行了...");
    }

    @Override
    public Thing1 clone() {
        Thing1 thing1 = null;
        try {
            thing1 = (Thing1) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing1;
    }
}
