package com.qfedu.service.impl;

import com.qfedu.dao.AdminLoginDao;
import com.qfedu.dao.impl.AdminLoginDaoImpl;
import com.qfedu.entity.User;
import com.qfedu.service.AdminLoginService;

public class AdminLoginServiceImpl implements AdminLoginService {
    @Override
    public int selectOne(User user) {
        AdminLoginDao adminLoginDao = new AdminLoginDaoImpl();
        int i = adminLoginDao.selectOne(user);
        return i;
    }
}
