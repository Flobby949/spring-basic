package top.flobby.boot.servlet.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import top.flobby.boot.servlet.interceptor.CustomInterceptor;

import javax.annotation.Resource;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/6
 * @description :
 */
@Configuration
public class MyWebMvcConfig implements WebMvcConfigurer {
    /**
     * 注入自定义拦截器
     */
    @Resource
    private CustomInterceptor customInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 自定义拦截器，排除路径
        registry.addInterceptor(customInterceptor).addPathPatterns("/**").excludePathPatterns("/api/login");
    }
}
