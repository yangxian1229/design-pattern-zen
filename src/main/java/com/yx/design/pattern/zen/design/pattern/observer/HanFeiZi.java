package com.yx.design.pattern.zen.design.pattern.observer;

import java.util.Observable;

/**
 * @author yangxian007
 * @date 2024/2/27
 */
public class HanFeiZi extends Observable implements IHanFeiZi{
    @Override
    public void haveBreakfast() {
        System.out.println("韩非子:开始吃饭了...");
        super.setChanged();
        super.notifyObservers("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子:开始娱乐了...");
        super.setChanged();
        super.notifyObservers("韩非子在娱乐");
    }
}
