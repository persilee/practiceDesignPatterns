package net.lishaoy.proxy;

import net.lishaoy.proxy.service.OrderService;
import net.lishaoy.proxy.service.impl.OrderServiceImpl;

/**
 *
 * 代理模式
 */

public class OrderClient {

    public static void main(String[] args) {

        OrderService orderService = new OrderServiceImpl();

        orderService.saveOrder();

        ProxyOrder proxyOrder = new ProxyOrder();

        proxyOrder.saveOrder();

    }

}
