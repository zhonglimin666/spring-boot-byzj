package com.example.service.impl;

import com.example.dao.AyUserDao;
import com.example.entity.AyUser;
import com.example.service.AyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author dongshi
 */
@Service
public class AyUserServiceImpl implements AyUserService {
    @Autowired
    private AyUserDao ayUserDao;


    @Override
    public AyUser findByNameAndPassword(String name, String password) {
        return ayUserDao.findByNameAndPassword(name,password);
    }

    @Override
    public AyUser getOne(String name) {
        return ayUserDao.findByName(name);
    }
}
