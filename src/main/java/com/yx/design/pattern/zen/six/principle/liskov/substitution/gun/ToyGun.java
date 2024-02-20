package com.yx.design.pattern.zen.six.principle.liskov.substitution.gun;

/**
 * @author yangxian007
 * @date 2024/1/25
 */
public class ToyGun extends AbstractToy {
    public ToyGun(AbstractGun gun) {
        super(gun);
    }

    @Override
    public String gunShape() {
        return super.gunShape();
    }
}
