package com.user.controller;

import com.user.pojo.User;
import com.user.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;

@RestController
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) throws UnsupportedEncodingException {
        User user=new User("wkl","password",18);
        if(user == null){
        	return "用户名或密码错误";
        }
        //登录成功则调用JWTUtil类的创建Token方法返回客户端
        String token= JWTUtil.createToken(user);
        return token;
    }
    
}
