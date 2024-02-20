package com.yx.design.pattern.zen.six.principle.liskov.substitution.gun;

import com.yx.design.pattern.zen.six.principle.liskov.substitution.gun.AbstractToy;

/**
 * @author yangxian007
 * @date 2024/1/25
 */
public class Child {
    private AbstractToy toy;

    public void setToy(AbstractToy _toy) {
        this.toy = _toy;
    }
    public void gunShape() {
        System.out.println("玩具枪的形状是：" + toy.gunShape());
    }
}
