package top.flobby.boot.aop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/1
 * @description :自定义切面
 */
// 一个切面
@Aspect
//一个组件，可以注入
@Component
@Slf4j
//多个切面的顺序
//@Order()
public class ControllerWebLogAspect {

//    /**
//     * 可以拥有当前线程变量，通过get，set操作
//     * 保存数据，实现线程隔离
//     * 用于多个方法之间共享日志
//     */
//    private ThreadLocal<Map<String, Object>> threadLocal = new ThreadLocal<>();
//
//    @Pointcut("execution(public * top.flobby.boot.aop.controller..*.*(..))")
//    public void WebLog() {
//
//    }
//
//    /**
//     * 前置增强，执行方法前做什么
//     *
//     * @param joinPoint        切点
//     * @param controllerWebLog 日志对象
//     */
////    @Before(value = "WebLog() && @annotation(controllerWebLog)")
//    public void doBefore(JoinPoint joinPoint, ControllerWebLog controllerWebLog) {
//        // 从请求上下文中获取request的属性集合
//        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
//        // 向下转型成sra
//        ServletRequestAttributes sra = (ServletRequestAttributes) ra;
//        // 获取request对象
//        assert sra != null;
//        HttpServletRequest request = sra.getRequest();
////        log.info("请求方法: " + request.getMethod());
////        log.info("请求uri: " + request.getRequestURI());
//        log.info("接口方法名" + controllerWebLog.name());
//        // 自定义注解中需要保存日志
//        if (controllerWebLog.isSave()) {
//            // 获取接口请求参数
//            Object[] args = joinPoint.getArgs();
//            log.info("参数数组" + Arrays.toString(args));
//            Map<String, Object> map = new HashMap<>(8);
//            map.put("uri", request.getRequestURI());
//            map.put("name", args[0]);
//            map.put("title", args[1]);
//            threadLocal.set(map);
//            log.info("访问成功，已保存");
//        } else {
//            log.info("访问成功，不需要保存");
//        }
//    }
//
////    @AfterReturning(value = "WebLog() && @annotation(controllerWebLog)", returning = "res")
//    public void doAfter(ControllerWebLog controllerWebLog, Object res) {
//        Map<String, Object> result = threadLocal.get();
//        log.info("日志数据：" + result);
//    }
//
////    @Around(value = "WebLog()")
////    public void doAround(ProceedingJoinPoint point) throws Throwable {
////        LocalDateTime before = LocalDateTime.now();
////        log.info("前" + before);
////        Object res = point.proceed();
////        log.info((String) res);
////        LocalDateTime after = LocalDateTime.now();
////        log.info("后" + after);
////        Duration dur = Duration.between(before, after);
////        log.info("差：" + dur);
////    }
//
////    @Around(value = "WebLog()")
//    public Object doAround(ProceedingJoinPoint point) throws Throwable{
//        // 得到开始时间
//        System.out.println("接口调用前");
//        long start = System.currentTimeMillis();
//        // 执行目标方法
//        Object ob = point.proceed();
//        System.out.println("接口调用后");
//        // 计算方法执行时间
//        long takeTime = System.currentTimeMillis() - start;
//        log.info("耗时： " + takeTime + "S");
//        return ob;
//    }
//
////    @AfterThrowing(value = "WebLog()", throwing = "throwable")
//    public void doThrowing(Throwable throwable) {
//        // 从请求上下文中获取request的属性集合
//        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
//        // 向下转型成sra
//        ServletRequestAttributes sra = (ServletRequestAttributes) ra;
//        // 获取request对象
//        assert sra != null;
//        HttpServletRequest request = sra.getRequest();
//        log.info("{}接口调用异常，异常信息{}", request.getRequestURI(), throwable.getMessage());
//    }
}
