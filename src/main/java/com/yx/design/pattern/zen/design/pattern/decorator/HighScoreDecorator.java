package com.yx.design.pattern.zen.design.pattern.decorator;

/**
 * @author yangxian007
 * @date 2024/2/22
 */
public class HighScoreDecorator extends Decorator{
    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }
    private void reportHighScore() {
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }
    @Override
    public void report() {
        super.report();
        this.reportHighScore();
    }
}
