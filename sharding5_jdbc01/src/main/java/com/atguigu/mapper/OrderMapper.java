package com.atguigu.mapper;

import com.atguigu.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Description ==> TODO
 * BelongsProject ==> sharding5_basic01
 * BelongsPackage ==> com.atguigu.mapper
 * Version ==> 1.0
 * CreateTime ==> 2022-11-14 08:17:36
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
