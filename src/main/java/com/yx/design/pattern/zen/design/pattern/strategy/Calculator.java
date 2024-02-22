package com.yx.design.pattern.zen.design.pattern.strategy;

/**
 * 策略枚举
 * @author yangxian007
 * @date 2024/2/22
 */
public enum Calculator {
    ADD("+") {
        @Override
        public int exec(int a, int b) {
            return a + b;
        }
    },
    SUB("-") {
        @Override
        public int exec(int a, int b) {
            return a - b;
        }
    };

    String value = "";

    private Calculator(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public abstract int exec(int a, int b);
}
