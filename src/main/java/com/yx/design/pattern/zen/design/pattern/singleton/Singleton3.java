package com.yx.design.pattern.zen.design.pattern.singleton;

/**
 * 懒汉式单例
 * @author yangxian007
 * @date 2024/1/30
 */
public class Singleton3 {
    private static Singleton3 singleton3 = null;

    /**
     * 限制产生多个对象
     */
    private Singleton3() {
    }

    /**
     * 通过该方法获得实例对象
     * synchronized 保证线程安全
     * 缺点：每次调用getInstance()都要同步，造成不必要的同步开销，而且大部分时候是不需要同步的，所以不建议使用
     * @return
     */
    public static synchronized Singleton3 getInstance() {
        if (singleton3 == null) {
            singleton3 = new Singleton3();
        }
        return singleton3;
    }

    /**
     * 类中其他方法，尽量是static
     */
    public static void doSomething() {
        System.out.println("do something");
    }
}
