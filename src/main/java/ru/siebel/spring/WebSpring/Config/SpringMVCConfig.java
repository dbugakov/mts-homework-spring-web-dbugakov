package ru.siebel.spring.WebSpring.Config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import ru.siebel.spring.WebSpring.interceptor.LoggerInterceptor;

@Configuration
public class SpringMVCConfig implements WebMvcConfigurer {
    //Задание 7
    @Autowired
    LoggerInterceptor loggerInterceptor;

    @Override
    public void addInterceptors(final InterceptorRegistry registry) {
        registry.addInterceptor(loggerInterceptor);
    }
}
