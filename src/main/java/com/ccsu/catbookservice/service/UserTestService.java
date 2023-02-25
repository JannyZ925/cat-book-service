package com.ccsu.catbookservice.service;

import com.ccsu.base.BaseQuery;
import com.ccsu.catbookservice.dao.UserMapper;
import com.ccsu.catbookservice.entity.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserTestService {
    @Autowired
    private UserMapper userMapper;


    /**
     * 测试用例
     * 条件查询全部
     * 比如分页信息，用户名
     * @param query
     * @return
     */
    public PageInfo<User> queryAllUserByParam(BaseQuery query) {
        if(query.getPageNum() == null){
            query.setPageNum(2);
        }
        if(query.getPageSize() == null){
            query.setPageSize(2);
        }
        //设置分页参数
        PageHelper.startPage(query.getPageNum(), query.getPageSize());
        //将查询出来的结果封装到分页信息对象里面
        PageInfo<User> userPageInfo = new PageInfo<User>(userMapper.queryAllUserByParam());
        return userPageInfo;
    }
}
