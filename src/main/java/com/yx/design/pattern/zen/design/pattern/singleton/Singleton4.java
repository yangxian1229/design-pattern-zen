package com.yx.design.pattern.zen.design.pattern.singleton;

/**
 * @author yangxian007
 * @date 2024/1/30
 */
public class Singleton4 {
    private static Singleton4 singleton4 = null;

    /**
     * 限制产生多个对象
     */
    private Singleton4() {
    }

    /**
     * 通过该方法获得实例对象
     * 双重检查锁定：
     * 优点：线程安全；延迟加载；效率较高
     * 缺点：复杂，不简单
     * 为什么需要双重锁定：因为如果不加第二个if判断，那么每次调用getInstance()都要同步，造成不必要的同步开销，而且大部分时候是不需要同步的，所以不建议使用
     * 如果不加第二个if判断，会有现成安全问题吗？会，因为singleton4 = new Singleton4();这句话并不是原子操作，实际上在JVM中这句话大概做了三件事情：
     * 哪三件事？1、给singleton4分配内存 2、调用Singleton4的构造函数来初始化成员变量 3、将singleton4对象指向分配的内存空间（执行完这步singleton4才是非null了）
     * @return
     */
    public static Singleton4 getInstance() {
        if (singleton4 == null) {
            synchronized (Singleton4.class) {
                if (singleton4 == null) {
                    singleton4 = new Singleton4();
                }
            }
        }
        return singleton4;
    }

    /**
     * 类中其他方法，尽量是static
     */
    public static void doSomething() {
        System.out.println("do something");
    }
}
