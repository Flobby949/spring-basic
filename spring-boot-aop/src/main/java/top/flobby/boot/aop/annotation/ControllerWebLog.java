package top.flobby.boot.aop.annotation;

import java.lang.annotation.*;

/**
 * @author Flobby
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

public @interface ControllerWebLog {
    /**
     * 一个name
     *
     * @return string
     */
    String name();

    /**
     * 是否需要保存日志，默认保存
     *
     * @return boolean
     */
    boolean isSave() default false;
}
