package dev.huang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 作者: Huang
 * 时间: 2022-11-04
 */

@Controller
public class IndexController {
    @GetMapping("/hello.do")
    public String hello(HttpServletRequest request){
        request.setAttribute("msg", "hello ssm框架");
        return "hello";
    }
}
