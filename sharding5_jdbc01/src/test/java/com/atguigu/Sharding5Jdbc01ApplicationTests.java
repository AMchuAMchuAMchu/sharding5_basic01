package com.atguigu;

import com.atguigu.entity.User;
import com.atguigu.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Sharding5Jdbc01ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {

        User user = new User();
        user.setUname("桐谷和人");
        userMapper.insert(user);


    }

}
