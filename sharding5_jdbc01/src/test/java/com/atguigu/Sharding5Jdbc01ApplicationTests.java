package com.atguigu;

import com.atguigu.entity.User;
import com.atguigu.mapper.UserMapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
class Sharding5Jdbc01ApplicationTests {

    @Autowired
    private UserMapper userMapper;



    @Test
    void testDelete(){

        int i = userMapper.deleteById(27);
        System.out.println(i>0?"哦咩爹多!!":"残念~~");



    }

    @Test
    void testUpdate(){

        User user = new User();
        user.setId(27L);
        user.setUname("雪乃");
        int i = userMapper.updateById(user);
        System.out.println(i>0?"哦咩爹多!!":"残念~~");


    }

    @Test
    void testInsertAndSelect(){

//        User user = new User();
//        user.setUname("优纪");
//        userMapper.insert(user);


        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();

//        lqw.orderByDesc(User::getId);
        lqw.like(User::getUname,"丝");

        List<User> users = userMapper.selectList(lqw);
        System.out.println("====");
        System.out.println("====");
        System.out.println("====");
        users.forEach(System.out::println);


    }

//    @Transactional//
    @Test
    void contextLoads() {

        User user = new User();
//        user.setUname("绀野木绵季");
//        user.setUname("绀野木绵季");
//        user.setUname("绀野木绵季");
        user.setUname("LycoReco");
        userMapper.insert(user);
        List<User> users01 = userMapper.selectList(null);
        List<User> users02 = userMapper.selectList(null);
        List<User> users03 = userMapper.selectList(null);
        List<User> users04 = userMapper.selectList(null);
        System.out.println();
        System.out.println();
        System.out.println();
//        users.forEach(System.out::println);


    }

}
