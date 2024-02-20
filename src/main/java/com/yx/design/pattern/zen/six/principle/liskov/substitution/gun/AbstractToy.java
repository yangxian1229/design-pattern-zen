package com.yx.design.pattern.zen.six.principle.liskov.substitution.gun;

/**
 * @author yangxian007
 * @date 2024/1/25
 */
public abstract class AbstractToy {
    private AbstractGun gun;

    public AbstractToy(AbstractGun gun) {
        this.gun = gun;
    }

    public String gunShape() {
        return this.gun.gunShape();
    }
}
