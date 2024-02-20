package com.yx.design.pattern.zen.design.pattern.mediator;

/**
 * 库存管理员类
 * @author yangxian007
 * @date 2024/2/20
 */
public class Stock extends AbstractColleague{
    public Stock(AbstractMediator mediator) {
        super(mediator);
    }
    // 刚开始有100台电脑
    private static int COMPUTER_NUMBER = 100;
    // 库存增加
    public void increase(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
        System.out.println("库存数量为："+COMPUTER_NUMBER);
    }
    // 库存降低
    public void decrease(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        System.out.println("库存数量为："+COMPUTER_NUMBER);
    }
    // 获得库存数量
    public int getStockNumber(){
        return COMPUTER_NUMBER;
    }
    // 存货压力大了，就要通知采购人员不要采购，销售人员尽快销售
    public void clearStock(){
        System.out.println("清理存货数量为："+COMPUTER_NUMBER);
        super.mediator.execute("stock.clear");
    }
}
