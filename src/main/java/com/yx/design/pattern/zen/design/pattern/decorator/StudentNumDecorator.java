package com.yx.design.pattern.zen.design.pattern.decorator;

/**
 * 学生人数装饰器类
 * @author yangxian007
 * @date 2024/2/22
 */
public class StudentNumDecorator extends  Decorator{
    public StudentNumDecorator(SchoolReport sr) {
        super(sr);
    }
    private void reportStudentNum() {
        System.out.println("班级总人数：50");
    }
    @Override
    public void report() {
        super.report();
        this.reportStudentNum();
    }
}
