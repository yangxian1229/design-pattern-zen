package com.yx.design.pattern.zen.design.pattern.visitor;

/**
 * @author yangxian007
 * @date 2024/2/28
 */
public class IdiotRole implements Role{
    @Override
    public void accept(AbsActor actor) {
        actor.act((com.yx.design.pattern.zen.design.pattern.visitor.Role) this);
    }
}
