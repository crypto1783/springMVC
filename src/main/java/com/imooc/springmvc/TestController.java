package com.imooc.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @GetMapping("/t") //localhost/t
    @ResponseBody//直接向响应输出字符串数据·123玩(⊙﹏⊙) 不跳转页面
    public String test(){
        return "SUCCESS";
    }
    //test
}
