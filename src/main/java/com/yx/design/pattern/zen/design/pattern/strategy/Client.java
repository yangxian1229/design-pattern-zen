package com.yx.design.pattern.zen.design.pattern.strategy;

/**
 * @author yangxian007
 * @date 2024/2/22
 */
public class Client {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println("运行结果为：" + Calculator.ADD.exec(a, b));
        System.out.println("运行结果为：" + Calculator.SUB.exec(a, b));
    }
}
