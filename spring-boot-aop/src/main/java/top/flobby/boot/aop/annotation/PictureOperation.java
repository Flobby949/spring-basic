package top.flobby.boot.aop.annotation;

import java.lang.annotation.*;

/**
 * @author :Flobby
 * @date :2021/4/1
 * @description :
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface PictureOperation {
    /**
     * 图片是否要压缩，默认压缩
     *
     * @return Boolean
     */
//    boolean isCompress() default true;

    /**
     * 图片是否要加水印，默认不加
     *
     * @return boolean
     */
    boolean isWatermark() default false;

    /**
     * 文字水印的内容
     *
     * @return string
     */
    String content() default "this is a picture";
}
