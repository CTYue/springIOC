package com.chuwa.springbasic.components.impl;

import com.chuwa.springbasic.components.Dependency;

/**
 * @author bigo
 */
public class DependencyNoComponent implements Dependency {

    @Override
    public void printMessage() {
        System.out.println("Message from Dependency Three - No @Component. By @Bean!");
    }
}
