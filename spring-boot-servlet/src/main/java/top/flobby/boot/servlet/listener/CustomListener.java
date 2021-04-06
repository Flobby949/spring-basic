package top.flobby.boot.servlet.listener;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/6
 * @description :
 */
//@WebListener
@Slf4j
public class CustomListener implements ServletContextListener,
        HttpSessionListener,
        ServletRequestListener,
        ServletRequestAttributeListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info(">>>>>>>>>>>应用初始化");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info(">>>>>>>>>>>应用被销毁");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        log.info("###########session被创建");

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        log.info("###########session被销毁");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        log.info("-----------request被创建");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        log.info("-----------request被销毁");
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        log.info("***********属性被创建");
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        log.info("***********属性被移除");
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        log.info("***********属性被修改");
    }
}
