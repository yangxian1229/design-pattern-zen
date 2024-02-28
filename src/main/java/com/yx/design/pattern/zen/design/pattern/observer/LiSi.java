package com.yx.design.pattern.zen.design.pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author yangxian007
 * @date 2024/2/27
 */
public class LiSi implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("李斯:观察到韩非子活动，开始向老板汇报了...");
        this.reportToQinShiHuang(arg.toString());
        System.out.println("李斯:汇报完毕...");
    }

    private void reportToQinShiHuang(String reportContext) {
        System.out.println("李斯:报告，秦老板！韩非子有活动了-->" + reportContext);
    }
}
