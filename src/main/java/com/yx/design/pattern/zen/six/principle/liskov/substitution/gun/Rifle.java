package com.yx.design.pattern.zen.six.principle.liskov.substitution.gun;

/**
 * @author yangxian007
 * @date 2024/1/24
 */
public class Rifle extends AbstractGun{
    @Override
    public String gunShape() {
        return "步枪";
    }

    @Override
    public void shoot() {
        //步枪的特点是射程远，威力大
        System.out.println("步枪射击...");
    }
}
