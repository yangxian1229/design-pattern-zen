package com.yx.design.pattern.zen.six.principle.liskov.substitution.gun;

import com.yx.design.pattern.zen.six.principle.liskov.substitution.gun.AbstractGun;

/**
 * @author yangxian007
 * @date 2024/1/24
 */
public class Soldier {
    /**
     * 定义士兵的枪支
     */
    private AbstractGun gun;

    /**
     * 给士兵一支枪
     * @param _gun
     */
    public void setGun(AbstractGun _gun){
        this.gun = _gun;
    }
    public void killEnemy(){
        System.out.println("士兵开始杀敌人...");
        gun.shoot();
    }
}
