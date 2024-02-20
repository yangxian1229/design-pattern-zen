package com.yx.design.pattern.zen.design.pattern.prototype.pattern;

/**
 * @author yangxian007
 * @date 2024/2/20
 */
public class Client {
    public static void main(String[] args) {
        // clone对象考虑不会执行构造函数
        Thing1 thing1 = new Thing1();
        Thing1 cloneThing1 = thing1.clone();

        // object的clone方法是浅拷贝
        Thing2 thing2 = new Thing2();
        thing2.setValue("张三");
        Thing2 cloneThing2 = thing2.clone();
        cloneThing2.setValue("李四");
        // 输出的是：[张三, 李四]，也就是thing2和cloneThing2的arrayList是同一个对象
        System.out.println(thing2.getValue());

        // 自定义的clone方法是深拷贝
        Thing3 thing3 = new Thing3();
        thing3.setValue("张三");
        Thing3 cloneThing3 = thing3.clone();
        cloneThing3.setValue("李四");
        // 输出的是：[张三, 李四]，也就是thing2和cloneThing2的arrayList是同一个对象
        System.out.println(thing3.getValue());
    }
}
