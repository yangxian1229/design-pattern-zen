package com.yx.design.pattern.zen.design.pattern.singleton;

/**
 * 饿汉式单例:
 * 1、在类加载时就完成了初始化，所以类加载较慢，但获取对象的速度快
 * 2、避免了线程同步问题
 * @author yangxian007
 * @date 2024/1/30
 */
public class Singleton1 {
    private static final Singleton1 singleton1 = new Singleton1();

    /**
     * 限制产生多个对象
     */
    private Singleton1() {
    }

    /**
     * 通过该方法获得实例对象
     * @return
     */
    public static Singleton1 getInstance() {
        return singleton1;
    }

    /**
     * 类中其他方法，尽量是static
     */
    public static void doSomething() {
        System.out.println("do something");
    }
}
