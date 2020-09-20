package com.example.service;

import com.example.entity.AyUser;

/**
 * @author dongshi
 */

public interface AyUserService {
    AyUser findByNameAndPassword(String name,String password);
    AyUser getOne(String name);
}
