package com.yx.design.pattern.zen.design.pattern.singleton;

/**
 * 懒汉式单例:
 * 1、在类加载时不初始化，在第一次调用getInstance()时初始化
 * 2、有线程安全问题
 * @author yangxian007
 * @date 2024/1/30
 */
public class Singleton2 {
    private static Singleton2 singleton2 = null;

    /**
     * 限制产生多个对象
     */
    private Singleton2() {
    }

    /**
     * 通过该方法获得实例对象
     * @return
     */
    public static Singleton2 getInstance() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }

    /**
     * 类中其他方法，尽量是static
     */
    public static void doSomething() {
        System.out.println("do something");
    }
}
