package com.user.controller;

import com.alibaba.fastjson.JSON;
import com.user.d.UserInfo;
import com.user.desen.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 脱敏测试
 */
@RestController
public class TestDesen {


    @RequestMapping("/abc")
    public String abc(){
        User user = new User();
        user.setId("111111");
        user.setAge(10);
        user.setEmail("780887377@qq.com");
        user.setName("wkl");
        return JSON.toJSONString(user);
    }
    @GetMapping("/testd")
    public UserInfo testd() {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(1004L);
        userInfo.setName("张三");
        userInfo.setEmail("1859656863@qq.com");
        userInfo.setPhone("15286535426");
        return userInfo;
    }


}
