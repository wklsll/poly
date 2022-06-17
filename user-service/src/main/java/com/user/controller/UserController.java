package com.user.controller;
import javax.servlet.http.HttpServletRequest;

import com.user.utils.JWTUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @GetMapping("/test")
    public String test(HttpServletRequest request){
        String token=request.getHeader("Authorization");
        if(token == null){
            return "尚未登录";
        }
        log.info("token 有效性{}",JWTUtil.verify(token));
        //获取到token中的用户信息
        System.out.println(JWTUtil.getUsername(token));
        //可自行编写获取用户信息后的操作
        //......

        return "Hello";
    }

}
