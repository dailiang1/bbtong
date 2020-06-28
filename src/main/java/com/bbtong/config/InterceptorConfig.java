package com.bbtong.config;


import com.bbtong.Filter.LoginFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(allowCredentials = "true")
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
//    @Bean
//    public static LoginFilter getLoginFiter() {
//        return new LoginFilter();
//    }

    @Resource
    private LoginFilter loginFilter;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 放行路径
//        List<String> patterns = new ArrayList();
//        patterns.add("/webjars/**");
//        patterns.add("/druid/**");
//        patterns.add("/user/login");
//        patterns.add("/swagger/**");
//        patterns.add("/v2/api-docs");
//        patterns.add("/swagger-ui.html");
//        patterns.add("/swagger-resources/**");
//        patterns.add("/user/*");
        registry.addInterceptor(loginFilter).addPathPatterns("/**")
                .excludePathPatterns("/user/login", "/swagger-resources/**", "/swagger-ui.html", "/webjars/**", "/v2/api-docs", "/user/*", "/insurance/select", "/client/add", "/entrust/have", "/entrust/add","/entrust/useralso");
    }

}
