package com.yx.design.pattern.zen.design.pattern.visitor;

/**
 * @author yangxian007
 * @date 2024/2/28
 */
public class KungFuRole implements Role{
    public void accept(AbsActor actor) {
        actor.act(this);
    }
}
