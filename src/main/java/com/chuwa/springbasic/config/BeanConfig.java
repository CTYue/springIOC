package com.chuwa.springbasic.config;

import com.chuwa.springbasic.components.JpaChuwa;
import com.chuwa.springbasic.components.impl.DataNucleusChuwaNoComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author bigo
 */
@Configuration
public class BeanConfig {

    /**
     * bean 名是方法名
     */
    @Bean
    public JpaChuwa myDataNucleus() {
        return new DataNucleusChuwaNoComponent();
    }
}
