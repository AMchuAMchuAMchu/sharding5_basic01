package com.atguigu;

import com.atguigu.entity.User;
import com.atguigu.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Sharding5Jdbc01ApplicationTests {

    @Autowired
    private UserMapper userMapper;



    @Test
    void testInsertAndSelect(){

        User user = new User();
        user.setUname("优纪");
        userMapper.insert(user);

        List<User> users = userMapper.selectList(null);
        System.out.println("====");
        System.out.println("====");
        System.out.println("====");
        users.forEach(System.out::println);


    }

    @Test
    void contextLoads() {

        User user = new User();
//        user.setUname("绀野木绵季");
//        user.setUname("绀野木绵季");
//        user.setUname("绀野木绵季");
        user.setUname("桐谷直叶");
        userMapper.insert(user);


    }

}
