package com.yx.design.pattern.zen.six.principle.liskov.substitution.gun;

/**
 * @author yangxian007
 * @date 2024/1/24
 */
public class MachineGun extends AbstractGun{
    @Override
    public String gunShape() {
        return "机枪";
    }

    @Override
    public void shoot() {
        System.out.println("机枪扫射...");
    }
}
