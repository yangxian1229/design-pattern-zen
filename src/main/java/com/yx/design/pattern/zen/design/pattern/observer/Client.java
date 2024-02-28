package com.yx.design.pattern.zen.design.pattern.observer;

/**
 * @author yangxian007
 * @date 2024/2/27
 */
public class Client {
    public static void main(String[] args) {
        HanFeiZi hanFeiZi = new HanFeiZi();
        LiSi liSi = new LiSi();
        hanFeiZi.addObserver(liSi);
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
