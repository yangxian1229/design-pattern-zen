package com.yx.design.pattern.zen.design.pattern.mediator;

/**
 * 抽象同事类
 * @author yangxian007
 * @date 2024/2/20
 */
public abstract class AbstractColleague {
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
