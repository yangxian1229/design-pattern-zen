package com.yx.design.pattern.zen.design.pattern.visitor;

import com.yx.design.pattern.zen.design.pattern.visitor.v1.KungFuRole;

/**
 * @author yangxian007
 * @date 2024/2/28
 */
public class OldActor extends AbsActor{
    public void act(KungFuRole role) {
        System.out.println("年龄大了，不能演功夫角色");
    }
}
