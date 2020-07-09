package com.example.springbootdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springbootdemo.entity.Demo;
import com.example.springbootdemo.mapper.DemoMapper;
import com.example.springbootdemo.service.IDemoService;
import org.springframework.stereotype.Service;

/**
 * @author qing.li07@hand-china.com
 * @version 1.0
 * @ClassName IDemoServiceImpl
 * @description
 * @date 2020/7/9 16:47
 * @since JDK 1.8
 */
@Service
public class DemoServiceImpl extends ServiceImpl<DemoMapper, Demo> implements IDemoService {
}
