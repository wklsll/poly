package com.user.d;

import lombok.Data;

@Data
public class UserInfo {

    // 用户id
    private Long id;

    // 姓名
    @Desensitize(rule = DesensitizeRuleEnums.CHINESE_NAME)
    private String name;

    // 邮箱
    @Desensitize(rule = DesensitizeRuleEnums.EMAIL)
    private String email;

    // 电话
    @Desensitize(rule = DesensitizeRuleEnums.MOBILE_PHONE)
    private String phone;
}
