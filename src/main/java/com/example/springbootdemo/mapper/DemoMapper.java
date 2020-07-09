package com.example.springbootdemo.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springbootdemo.entity.Demo;
import org.springframework.stereotype.Repository;

/**
 * @author qing.li07@hand-china.com
 * @version 1.0
 * @ClassName DemoMapper
 * @description
 * @date 2020/7/9 16:48
 * @since JDK 1.8
 */
@Repository
public interface DemoMapper extends BaseMapper<Demo> {
}
