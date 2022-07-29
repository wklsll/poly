package com.user.desen;

public interface DataMaskingOperation {
  
    String MASK_CHAR = "*";  
  
    String mask(String content, String maskChar);  
  
}  