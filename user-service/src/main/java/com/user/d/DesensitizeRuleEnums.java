package com.user.d;

import cn.hutool.core.util.DesensitizedUtil;
import lombok.AllArgsConstructor;

import java.util.function.Function;

/**
 * 脱敏策略
 *
 * @author Asurplus
 */
//@AllArgsConstructor
public enum DesensitizeRuleEnums {

    /**
     * 用户id脱敏
     */
    USER_ID(s -> String.valueOf(DesensitizedUtil.userId())),

    /**
     * 中文姓名脱敏
     */
    CHINESE_NAME(DesensitizedUtil::chineseName),

    /**
     * 身份证脱敏
     */
    ID_CARD(s -> DesensitizedUtil.idCardNum(s, 3, 4)),

    /**
     * 固定电话
     */
    FIXED_PHONE(DesensitizedUtil::fixedPhone),

    /**
     * 手机号脱敏
     */
    MOBILE_PHONE(DesensitizedUtil::mobilePhone),

    /**
     * 地址脱敏
     */
    ADDRESS(s -> DesensitizedUtil.address(s, 8)),

    /**
     * 电子邮箱脱敏
     */
    EMAIL(DesensitizedUtil::email),

    /**
     * 密码脱敏
     */
    PASSWORD(DesensitizedUtil::password),

    /**
     * 中国车牌脱敏
     */
    CAR_LICENSE(DesensitizedUtil::carLicense),

    /**
     * 银行卡脱敏
     */
    BANK_CARD(DesensitizedUtil::bankCard),

    MY_RULE((name)-> name+"---");

    /**
     * 可自行添加其他脱敏策略
     */
    private final Function<String, String> desensitize;

    DesensitizeRuleEnums(Function<String, String> desensitize) {
        this.desensitize = desensitize;
    }

    public Function<String, String> desensitize() {
        return desensitize;
    }
}
