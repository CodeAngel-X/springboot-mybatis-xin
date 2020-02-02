package com.example.service.user;

import com.example.model.UserDomain;
import com.github.pagehelper.PageInfo;

/**
 * @author 小辛
 * Data 2020.02.01 20:39
 * @Description
 */
public interface UserService {
    int addUser(UserDomain user);

    PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);
}
