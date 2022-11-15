package com.atguigu.mapper;

import com.atguigu.entity.Order;
import com.atguigu.entity.OrderVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

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


    @Select({"SELECT o.order_no, SUM(i.price * i.count) AS amount,FROM t_order o JOIN t_order_item i ON o.order_no =i.order_no,GROUP BY o.order_no;"})
    List<OrderVo> getOrderAmount();

}
