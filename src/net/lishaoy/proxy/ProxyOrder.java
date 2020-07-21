package net.lishaoy.proxy;

import net.lishaoy.proxy.service.OrderService;
import net.lishaoy.proxy.service.impl.OutOrderServiceImpl;

public class ProxyOrder implements OrderService {

    private OrderService orderService = new OutOrderServiceImpl();

    @Override
    public int saveOrder() {

        System.out.println("海外订单");

        return orderService.saveOrder();
    }
}
