package com.chuwa.springbasic.config;

import com.chuwa.springbasic.components.Dependency;
import com.chuwa.springbasic.components.impl.DependencyImplNoComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public Dependency dependencyImplThree() {
        return new DependencyImplNoComponent();
    }
}
