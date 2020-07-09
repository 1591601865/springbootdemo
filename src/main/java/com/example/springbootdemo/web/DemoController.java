package com.example.springbootdemo.web;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.springbootdemo.entity.Demo;
import com.example.springbootdemo.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qing.li07@hand-china.com
 * @version 1.0
 * @ClassName DemoController
 * @description
 * @date 2020/7/9 16:46
 * @since JDK 1.8
 */
@RequestMapping("/api/demo/demo")
@RestController
public class DemoController {

    @Autowired
    private IDemoService demoService;

    @GetMapping(value = "/listAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Demo>> selectDemoList(){
        List<Demo> list = demoService.list(new QueryWrapper<Demo>());
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping(value = "/add10", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity saveDemoList(@RequestParam long num,@RequestParam String pre){
        ArrayList<Demo> demos = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            demos.add(Demo.builder().code(pre+"_CODE_"+i).name(pre+"_NAME_"+i).build());
        }
        return ResponseEntity.ok(demoService.saveBatch(demos));
    }
}
