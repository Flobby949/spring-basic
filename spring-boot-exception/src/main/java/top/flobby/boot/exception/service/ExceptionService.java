package top.flobby.boot.exception.service;

import org.springframework.stereotype.Service;
import top.flobby.boot.exception.common.CustomExceptionEnum;
import top.flobby.boot.exception.exception.CustomException;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/8
 * @description :
 */

@Service
public class ExceptionService {
    /**
     * 服务层，模拟系统异常
     */
    public void systemError() {
        try {
            int[] a = new int[]{1, 2, 3};
            System.out.println(a[4]);
            // System.out.println(a[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            throw new CustomException(
                    CustomExceptionEnum.SYSTEM_ERROR,
                    "在XXX业务⽅法内，出现 ArrayIndexOutOfBoundsException，请将该信息告知管理员");
        }
    }
    /**
     * 服务层，模拟⽤户输⼊数据导致的校验异常
     *
     * @param input ⼊参
     */
    public void userError(int input) {
        //模拟业务校验失败逻辑
        if (input < 0) {
            throw new CustomException(
                    CustomExceptionEnum.USER_INPUT_ERROR,
                    "您输⼊的数据不符合业务逻辑，请确认后重新输⼊！");
        }
    }
}