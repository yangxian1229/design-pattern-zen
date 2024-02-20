package com.yx.design.pattern.zen.six.principle.liskov.substitution.gun;

/**
 * Liskov Substitution Principle，LSP（里氏替换原则）
 *
 * @author yangxian007
 * @date 2024/1/24
 */
public class LSPMain {
    public static void main(String[] args) {
        //产生三毛这个士兵
        Soldier sanMao = new Soldier();
        //给三毛一支枪
        sanMao.setGun(new Rifle());
        sanMao.killEnemy();

        Child child = new Child();
        child.setToy(new ToyGun(new HandGun()));
        child.gunShape();
    }
}
