package com.yx.design.pattern.zen.six.principle.liskov.substitution.gun;

/**
 * @author yangxian007
 * @date 2024/1/24
 */
public abstract class AbstractGun {

    public abstract String gunShape();
    //枪用来干什么的？杀敌！
    public abstract void shoot();
}
