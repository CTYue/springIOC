package com.chuwa.springbasic.config;

import com.chuwa.springbasic.components.JpaChuwa;
import com.chuwa.springbasic.components.impl.DataNucleusChuwaNoComponent;
import org.springframework.context.annotation.*;


/**
 * @author bigo
 */
@Configuration
@ComponentScan(basePackages = {"com.chuwa.springbasic"})
public class BeanConfig {

    /**
     * bean 名是方法名
     */
    @Bean
    @Primary
    @Scope("prototype")
    public JpaChuwa myDataNucleus() {
        return new DataNucleusChuwaNoComponent();//new Object(), builder pattern
    }
}
