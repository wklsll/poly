package com.user.parse;

import com.user.annotion.Ljia;
import com.user.annotion.Pauth;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import java.lang.annotation.Annotation;

@Slf4j
public class LjiResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter methodParameter) {
        log.error("0000000000000000000000000000000");
        return methodParameter.hasParameterAnnotation(Ljia.class);
    }

    @Override
    public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
        log.error("11111111111111111111111");
        Annotation[] parameterAnnotations = methodParameter.getParameterAnnotations();
        for (Annotation annotation : parameterAnnotations) {
            if (annotation instanceof Ljia) {
                Ljia p = (Ljia) annotation;
                log.error("----- p -------");
                log.error(p.require() + "");
                log.error(p.name());
                log.error("----- p -------");
            }
        }
        return null;
//        throw new RuntimeException("chuan参一场");
//        Pauth parameterAnnotation = methodParameter.getParameterAnnotation(Pauth.class);
//        log.error("resolveArgument" + parameterAnnotation.name());
//        log.error("resolveArgument" + parameterAnnotation.require());
//        SecurityContextHolder
//        return SecurityContextHolder.getContext().getAuthentication().getPrincipal();;
    }
}
