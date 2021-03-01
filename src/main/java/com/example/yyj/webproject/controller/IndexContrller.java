package com.example.yyj.webproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yuyeji
 * 2021/2/25 16:14
 */
@RequestMapping("index")
@RestController
public class IndexContrller {

    @RequestMapping("console")
    public String index() {
        return "hello world!";
    }
}
