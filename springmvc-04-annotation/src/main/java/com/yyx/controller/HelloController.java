package com.yyx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(Model model) {
        //封装数据
        //向模型中添加属性msg与值，可在jsp页面中取出并渲染
        model.addAttribute("msg", "Hello,springmvc");
        return "hello";//被视图解析器处理
    }
}
