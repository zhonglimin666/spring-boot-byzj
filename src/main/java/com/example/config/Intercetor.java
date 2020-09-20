package com.example.config;

import com.example.interceptor.LoginIntercetor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author dongshi
 */
@Configuration
public class Intercetor implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //需要拦截的路径,通常是多个,所以用数组形式
        String addpathpt[]={"/success","/toupdate","/update"};
        //不需要拦截的路径,通常是多个,所以用数组形式
        String excludepathpt[]={"/login"};
        registry.addInterceptor(new LoginIntercetor()).addPathPatterns(addpathpt).excludePathPatterns(excludepathpt);
    }
}
