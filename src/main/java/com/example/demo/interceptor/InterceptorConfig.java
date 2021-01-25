package com.example.demo.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration registration = registry.addInterceptor(authenticationInterceptor());
        registration.addPathPatterns("/api/**");   ///api/之下所有路径都被拦截
        registration.excludePathPatterns(
                                        "/api/user/login",      //添加不拦截路径
                                        "/api/user/info"
//                                        "/css/**",            //html静态资源
//                                        "/fonts/**",              //js静态资源
//                                        "/img/**",             //css静态资源
//                                        "/js/**",
//                                        "/local/**",
//                                        "**.png",
//                                        "**.html"
        );
    }

    @Bean
    public AuthenticationInterceptor authenticationInterceptor() {
        return new AuthenticationInterceptor();
    }
}
