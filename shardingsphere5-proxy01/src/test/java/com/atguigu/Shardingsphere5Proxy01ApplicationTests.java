package com.atguigu;

import com.atguigu.entity.User;
import com.atguigu.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Shardingsphere5Proxy01ApplicationTests {


    @Autowired
    private UserMapper userMapper;

    @Test
    void testSelect(){

        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);


    }

    @Test
    void contextLoads() {
    }

}
