package com.user.desen;

import lombok.Data;

import java.io.Serializable;
@Data
public class User implements Serializable {
    /**  
     * 主键ID  
     */  
    private String id;
  
    /**  
     * 姓名  
     */  
    @DataMasking(maskFunc = DataMaskingFunc.ALL_MASK)  
    private String name;  
  
    /**  
     * 年龄  
     */  
    private Integer age;  
  
    /**  
     * 邮箱  
     */  
    @DataMasking(maskFunc = DataMaskingFunc.ALL_MASK)  
    private String email;  
  
}