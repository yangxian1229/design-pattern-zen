package com.yx.design.pattern.zen.design.pattern.decorator;

/**
 * @author yangxian007
 * @date 2024/2/22
 */
public abstract class Decorator extends SchoolReport {
    private SchoolReport sr;

    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    public void report() {
        this.sr.report();
    }

    public void sign(String name) {
        this.sr.sign(name);
    }
}
