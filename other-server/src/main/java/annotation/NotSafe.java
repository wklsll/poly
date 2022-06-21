package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 线程不安全
 */
@Target(ElementType.TYPE)
public @interface NotSafe {
}
