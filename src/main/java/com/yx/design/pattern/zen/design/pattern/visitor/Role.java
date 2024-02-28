package com.yx.design.pattern.zen.design.pattern.visitor;

/**
 * @author yangxian007
 * @date 2024/2/28
 */
public interface Role {
    // 演员要扮演的角色
    void accept(AbsActor actor);
}
