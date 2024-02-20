package com.yx.design.pattern.zen.design.pattern.mediator;

/**
 * 抽象中介者
 * @author yangxian007
 * @date 2024/2/20
 */
public abstract class AbstractMediator {
    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public AbstractMediator() {
        purchase = new Purchase(this);
        sale = new Sale(this);
        stock = new Stock(this);
    }

    // 中介者最重要的方法叫做事件方法，处理多个对象之间的关系
    public abstract void execute(String str, Object... objects);
}
