package net.lishaoy.proxy.service.impl;

import net.lishaoy.proxy.service.OrderService;

public class OutOrderServiceImpl implements OrderService {

    @Override
    public int saveOrder() {

        System.out.println("海外订单下单成功，订单号：678902323");

        return 678902323;
    }
}
