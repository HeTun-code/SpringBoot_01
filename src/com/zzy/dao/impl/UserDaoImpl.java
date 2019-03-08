package com.zzy.dao.impl;

import com.zzy.dao.IUserDao;
import com.zzy.pojo.User;

public class UserDaoImpl implements IUserDao {
    @Override
    public void insert(User user) {
        System.out.println("Adding" + user);
    }
}
