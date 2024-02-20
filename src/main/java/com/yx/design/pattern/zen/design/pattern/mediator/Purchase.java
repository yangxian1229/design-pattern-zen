package com.yx.design.pattern.zen.design.pattern.mediator;

/**
 * 采购员类
 * @author yangxian007
 * @date 2024/2/20
 */
public class Purchase extends AbstractColleague{
    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    // 采购IBM电脑
    public void buyIBMcomputer(int number){
        super.mediator.execute("purchase.buy", number);
    }

    // 不再采购IBM电脑
    public void refuseBuyIBM(){
        System.out.println("不再采购IBM电脑");
    }
}
