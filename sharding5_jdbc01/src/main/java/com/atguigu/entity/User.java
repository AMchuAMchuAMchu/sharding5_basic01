package com.atguigu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Description ==> TODO
 * BelongsProject ==> sharding5_basic01
 * BelongsPackage ==> com.atguigu.entity
 * Version ==> 1.0
 * CreateTime ==> 2022-11-13 13:48:30
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@TableName("t_user")
@Data
public class User {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String uname;

}

