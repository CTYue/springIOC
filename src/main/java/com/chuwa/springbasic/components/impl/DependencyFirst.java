package com.chuwa.springbasic.components.impl;

import com.chuwa.springbasic.components.Dependency;
import org.springframework.stereotype.Component;

/**
 * @author bigo
 */
@Component
public class DependencyFirst implements Dependency {

    @Override
    public void printMessage() {
        System.out.println("Message from Dependency First!");
    }
}
