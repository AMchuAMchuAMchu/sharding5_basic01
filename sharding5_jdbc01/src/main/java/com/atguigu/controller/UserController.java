package com.atguigu.controller;

import com.atguigu.entity.User;
import com.atguigu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description ==> TODO
 * BelongsProject ==> sharding5_basic01
 * BelongsPackage ==> com.atguigu.controller
 * Version ==> 1.0
 * CreateTime ==> 2022-11-14 06:51:57
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping
    public String getUser(){
        User user = userMapper.selectById(11);
        return user.toString();
    }

}
