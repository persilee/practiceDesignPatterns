package net.lishaoy.proxy.service.impl;

import net.lishaoy.proxy.service.OrderService;

public class OrderServiceImpl implements OrderService {

    @Override
    public int saveOrder() {

        System.out.println("下单成功！订单号是：697687923");

        return 697687923;
    }
}
