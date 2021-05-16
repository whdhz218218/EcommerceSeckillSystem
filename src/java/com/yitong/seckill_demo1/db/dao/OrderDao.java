package com.yitong.seckill_demo1.db.dao;

import com.yitong.seckill_demo1.db.po.Order;

public interface OrderDao {
    void insertOrder(Order order);
    Order queryOrder(String orderNo);
    void updateOrder(Order order);
}
