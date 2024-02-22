package com.yx.design.pattern.zen.design.pattern.decorator;

/**
 * @author yangxian007
 * @date 2024/2/22
 */
public class Father {
    public static void main(String[] args) {
        // 把成绩单拿过来
        SchoolReport sr;
        // 原装的成绩单
        sr = new FouthGradeSchoolReport();
        // 加了最高分说明的成绩单
        sr = new HighScoreDecorator(sr);
        // 又增加了班级人数的说明
        sr = new StudentNumDecorator(sr);
        // 又加了成绩排名的说明
        sr = new SortDecorator(sr);

        // 为什么能对sr对象多次装饰？装饰器链
        // 看成绩单
        sr.report();
        // 然后老爸，一看，很开心，就签名了
        sr.sign("老三");
    }
}
