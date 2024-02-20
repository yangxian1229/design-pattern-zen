package com.yx.design.pattern.zen.six.principle.liskov.substitution.gun;

/**
 * @author yangxian007
 * @date 2024/1/24
 */
public class HandGun extends AbstractGun{
    @Override
    public String gunShape() {
        return "手枪";
    }

    @Override
    public void shoot() {
        //手枪的特点是携带方便，射程短
        System.out.println("手枪射击...");
    }
}
