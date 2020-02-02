package com.example.dao;

import com.example.model.UserDomain;

import java.util.List;

/**
 * @author 小辛
 * Data 2020.02.01 20:19
 * @Description
 */
public interface UserDao {

    int insert(UserDomain record);



    List<UserDomain> selectUsers();
}
