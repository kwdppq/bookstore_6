package com.qfedu.service;

import com.qfedu.entity.Order;
import com.qfedu.service.impl.OrderException;

import java.util.List;

public interface OrderService {
    public void add(Order order);
    public List<Order> myOrders(String uid);
    public Order load(String oid);
    public void confirm(String oid) throws OrderException;
    public void payConfirm(String oid);
}
