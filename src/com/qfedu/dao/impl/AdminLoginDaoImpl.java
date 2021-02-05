package com.qfedu.dao.impl;

import com.qfedu.dao.AdminLoginDao;
import com.qfedu.entity.User;
import com.qfedu.util.BaseDao;

import java.sql.ResultSet;

public class AdminLoginDaoImpl extends BaseDao implements AdminLoginDao {
    @Override
    public int selectOne(User user) {
        String sql = "select * from user where username=? and password=?";
        Object[] obj = {user.getUsername(), user.getPassword()};
        int count=0;
        try {
            ResultSet resultSet = this.select(sql, obj);
            while (resultSet.next()) {
                count++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }
}
