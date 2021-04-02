package top.flobby.boot.aop.annotation;

import java.lang.annotation.*;

/**
 * @author Flobby
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ControllerWebLog {
    String name();

    boolean isSave() default false;
}
