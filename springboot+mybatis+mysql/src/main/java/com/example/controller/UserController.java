package com.example.controller;

import com.example.domain.UserTable;
import com.example.mapper.UserTableMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {
    @Autowired
    private UserTableMapper userTableMapper;

    @ResponseBody
    @RequestMapping(value = "/getuser")
    public UserTable getUser(){
        UserTable userTable = userTableMapper.selectByPrimaryKey(1);
        return userTable;
    }

}
