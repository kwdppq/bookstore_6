package com.qfedu.service.impl;

import cn.itcast.jdbc.JdbcUtils;
import com.qfedu.dao.OrderDao;
import com.qfedu.dao.impl.OrderDaoImpl;
import com.qfedu.entity.Order;
import com.qfedu.service.OrderService;

import java.sql.SQLException;
import java.util.List;

public class OrderServiceImpl implements OrderService {
    OrderDao orderDao = new OrderDaoImpl();
    /**
     * 添加订单,需使用数据库事务
     * @param order
     */
    public void add(Order order){
        try {
            //开启事务
            JdbcUtils.beginTransaction();

            orderDao.addOrder(order);//插入订单
            orderDao.addOrderItemList(order.getOrderItemList());//插入订单所有条目

            //提交事务
            JdbcUtils.commitTransaction();

        } catch (SQLException e) {
            try {
                //回滚事务
                JdbcUtils.rollbackTransaction();
            } catch (SQLException e2) {
                throw new RuntimeException(e2);
            }
            throw new RuntimeException(e);
        }
    }
    /**
     * 根据用户名查找所属的订单
     * @param uid
     * @return
     */
    public List<Order> myOrders(String uid) {
        return orderDao.findByUid(uid);
    }


    public Order load(String oid) {
        return orderDao.findByOid(oid);
    }
    /**
     * 确认收货
     * @param oid
     * @throws OrderException
     */
    public void confirm(String oid) throws OrderException{
        int state = orderDao.getStateByOid(oid);
        if (state != 3 ) throw new OrderException("确认订单失败,你不是好人!");
        orderDao.updateState(oid, 4);
    }
    /**
     * 把未付款改成确认收货,直接跳过等待发货,为方便模拟支付效果
     * @param oid
     */
    public void payConfirm(String oid) {
        int state = orderDao.getStateByOid(oid);
        if(state == 1){
            orderDao.updateState(oid, 3);
        }
    }
}
