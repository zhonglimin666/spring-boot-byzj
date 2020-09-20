package com.example.dao;

import com.example.entity.AyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author dongshi
 */
@Repository
public interface AyUserDao extends JpaRepository<AyUser,Integer> {
    //自定义方法
    AyUser findByNameAndPassword(String name,String password);
    AyUser findByName(String name);
}
