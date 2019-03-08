package com.zzy.service.impl;

import com.zzy.dao.IUserDao;
import com.zzy.pojo.User;
import com.zzy.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao = null;

    @Override
    public void addUser(User user) {
        userDao.insert(user);
    }
}
