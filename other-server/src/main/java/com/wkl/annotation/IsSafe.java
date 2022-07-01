package com.wkl.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 线程安全
 */
@Target({ElementType.TYPE,ElementType.METHOD})
public @interface IsSafe {
}
