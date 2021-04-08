package top.flobby.boot.exception.exception;

import top.flobby.boot.exception.common.CustomExceptionEnum;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/8
 * @description :
 */

public class CustomException extends RuntimeException {
    /**
     * 异常错误编码
     */
    private int code;
    /**
     * 异常信息
     */
    private String message;

    private CustomException() {
    }

    public CustomException(CustomExceptionEnum
                                   exceptionEnum) {
        this.code = exceptionEnum.getCode();
        this.message = exceptionEnum.getMsg();
    }

    public CustomException(CustomExceptionEnum
                                   exceptionEnum,
                           String message) {
        this.code = exceptionEnum.getCode();
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
