package top.flobby.boot.aop.aspect;

import cn.hutool.core.img.ImgUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import top.flobby.boot.aop.annotation.PictureOperation;

import javax.servlet.http.HttpServletRequest;
import java.awt.*;
import java.util.Map;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/1
 * @description :
 */

@Aspect
@Component
@Slf4j
public class PictureOperationAspect {
    private ThreadLocal<Map<String, Object>> threadLocal = new ThreadLocal<>();

    @Pointcut("execution(public * top.flobby.boot.aop.controller..*.*(..))")
    public void WebLog() {

    }

    @Around(value = "WebLog() && @annotation(pictureOperation)")
    public Object doAround(ProceedingJoinPoint point, PictureOperation pictureOperation) throws Throwable {
        // 得到开始时间
        System.out.println("接口调用前");
        long start = System.currentTimeMillis();
        // 执行目标方法
        Object ob = point.proceed();
        System.out.println(ob);
        System.out.println("接口调用后");
        // 计算方法执行时间
        long takeTime = System.currentTimeMillis() - start;
        log.info("耗时： " + takeTime + "S");
        ImgUtil.pressText(
                FileUtil.file(ob.toString()),
                FileUtil.file(ob.toString()),
                pictureOperation.content(), Color.WHITE,
                new Font("黑体", Font.BOLD, 100),
                0,
                0,
                0.5f
        );
       int index = ob.toString().lastIndexOf("/");
       String fn = ob.toString().substring(index);
        QrCodeUtil.generate("http://flobby.cn1.utools.club/upload/"+fn, 300, 300, FileUtil.file("C:/Users/Lenovo/Desktop/qrcode.jpg"));
        return ob;
    }
    @AfterThrowing(value = "WebLog()", throwing = "throwable")
    public void doThrowing(Throwable throwable) {
        // 从请求上下文中获取request的属性集合
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        // 向下转型成sra
        ServletRequestAttributes sra = (ServletRequestAttributes) ra;
        // 获取request对象
        assert sra != null;
        HttpServletRequest request = sra.getRequest();
        log.info("{}接口调用异常，异常信息{}", request.getRequestURI(), throwable.getMessage());
    }
}
