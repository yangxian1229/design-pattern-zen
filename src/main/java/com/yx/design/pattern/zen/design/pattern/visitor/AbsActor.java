package com.yx.design.pattern.zen.design.pattern.visitor;

import com.yx.design.pattern.zen.design.pattern.visitor.KungFuRole;
import com.yx.design.pattern.zen.design.pattern.visitor.Role;

/**
 * @author yangxian007
 * @date 2024/2/28
 */
public abstract class AbsActor {
    public void act(Role role) {
        System.out.println("演员可以扮演任何角色");
    }

    public void act(KungFuRole role) {
        System.out.println("演员可以扮演功夫角色");
    }
}
