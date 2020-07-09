package com.example.springbootdemo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

/**
 * @author qing.li07@hand-china.com
 * @version 1.0
 * @ClassName Demo
 * @description
 * @date 2020/7/9 16:47
 * @since JDK 1.8
 */
@Data
@Builder
@TableName("DEMO")
public class Demo {
    @TableId
    private Long id;
    @TableField
    private String code;
    @TableField
    private String name;
}
