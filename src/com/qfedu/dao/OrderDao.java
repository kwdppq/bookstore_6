package com.qfedu.dao;

import com.qfedu.entity.Order;
import com.qfedu.entity.OrderItem;

import java.util.List;
import java.util.Map;

public interface OrderDao {
    public void addOrder(Order order);
    public void addOrderItemList(List<OrderItem> orderItemList);
    public List<Order> findByUid(String uid);
    public void loadOrderItems(Order order);
    public List<OrderItem> toOrderItemList(List<Map<String, Object>> mapList);
    public OrderItem toOrderItem(Map<String, Object> map);
    public Order findByOid(String oid);
    public int getStateByOid(String oid);
    public void updateState(String oid, int state);
}
