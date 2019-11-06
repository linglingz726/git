package com.offcn.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PageController {
    @Value("${page.rows}")  //从文件（application.yml）中读取的值赋给rows属性
    private Integer rows;
    @RequestMapping("/getRows")
    public Map<String,Integer> getRows(){
        Map<String,Integer> map = new HashMap<>();
        map.put("rows",rows);
        return map;
    }
}
