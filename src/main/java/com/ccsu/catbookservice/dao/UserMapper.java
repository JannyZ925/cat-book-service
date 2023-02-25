package com.ccsu.catbookservice.dao;

import com.ccsu.catbookservice.entity.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 测试
     * 这个方法是自己写的
     * @return
     */
    List<User> queryAllUserByParam();
}