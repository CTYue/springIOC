package com.chuwa.springbasic.main.DITypes;

import com.chuwa.springbasic.components.JpaChuwa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @author b1go
 * @date 9/1/22 12:12 AM
 */
@Component
public class DependencyInjectionTypesConstructorAndFieldAndSetter {

    /**
     * type 1, field Injection
     */
//    @Autowired
    private JpaChuwa jpaChuwa;

    /**
     * type 2, Constructor Injection
     * @Autowired可以省略
     */
    @Autowired
    public DependencyInjectionTypesConstructorAndFieldAndSetter(JpaChuwa jpaChuwa) {
        this.jpaChuwa = jpaChuwa;
    }

    /**
     * type 3, Setter Injection
     * @Autowired可以省略
     */
//    @Autowired
    public void setJpaChuwa(JpaChuwa jpaChuwa) {
        this.jpaChuwa = jpaChuwa;
    }

    public void printMessage() {
        jpaChuwa.printMessage();
    }
}
