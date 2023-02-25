package com.ccsu.catbookservice.controller;

import com.ccsu.base.BaseQuery;
import com.ccsu.catbookservice.entity.User;
import com.ccsu.catbookservice.service.UserTestService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserControllerTest {

    @Autowired
    private UserTestService userTestService;

    @PostMapping("/list")
    public PageInfo<User> testUserList(BaseQuery query){
        return userTestService.queryAllUserByParam(query);
    }
}
