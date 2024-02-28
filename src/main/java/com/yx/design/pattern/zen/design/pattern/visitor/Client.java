package com.yx.design.pattern.zen.design.pattern.visitor;

/**
 * @author yangxian007
 * @date 2024/2/28
 */
public class Client {
    public static void main(String[] args) {
        AbsActor actor = new OldActor();
        Role role = new KungFuRole();
        role.accept(actor);
    }
}
