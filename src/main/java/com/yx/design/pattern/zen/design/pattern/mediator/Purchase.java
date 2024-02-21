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
    // 依赖方法 dep-method
    public void buyIBMcomputer(int number){
        // 处理自己的业务逻辑
        System.out.println("Purchase采购IBM电脑"+number+"台");
        // 自己不能处理的业务逻辑，交给中介者处理
        super.mediator.execute("purchase.buy", number);
    }

    // 不再采购IBM电脑
    // 自有方法 self-method
    public void refuseBuyIBM(){
        System.out.println("不再采购IBM电脑");
    }
}
