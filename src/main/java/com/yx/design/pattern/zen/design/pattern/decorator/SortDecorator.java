package com.yx.design.pattern.zen.design.pattern.decorator;

/**
 * @author yangxian007
 * @date 2024/2/22
 */
public class SortDecorator extends Decorator{
    public SortDecorator(SchoolReport sr) {
        super(sr);
    }
    private void reportSort() {
        System.out.println("我是排名第38名...");
    }
    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
