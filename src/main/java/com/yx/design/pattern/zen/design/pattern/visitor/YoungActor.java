package com.yx.design.pattern.zen.design.pattern.visitor;

import com.yx.design.pattern.zen.design.pattern.visitor.v1.KungFuRole;

/**
 * @author yangxian007
 * @date 2024/2/28
 */
public class YoungActor extends AbsActor{
    public void act(KungFuRole role) {
        System.out.println("最喜欢演功夫角色");
    }
}
