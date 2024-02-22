package com.yx.design.pattern.zen.design.pattern.decorator;

/**
 * 四年级成绩单类
 * @author yangxian007
 * @date 2024/2/22
 */
public class FouthGradeSchoolReport extends SchoolReport{
    /**
     * 展示成绩单
     * 在实际工程实现的时候，这些都可以从数据库中获取
     */
    @Override
    public void report() {
        System.out.println("尊敬的XXX家长：");
        System.out.println("  ......");
        System.out.println("  语文 62  数学65 体育 98  自然 63");
        System.out.println("  .......");
        System.out.println("               家长签名：       ");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名为："+name);
    }
}
