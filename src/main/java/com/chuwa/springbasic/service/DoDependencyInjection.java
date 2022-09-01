package com.chuwa.springbasic.service;

import com.chuwa.springbasic.components.Dependency;
import com.chuwa.springbasic.components.impl.DependencyFirst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author b1go
 * @date 9/1/22 12:12 AM
 */
@Component
public class DoDependencyInjection {
    /**
     * Match by type
     */
    @Autowired
    private DependencyFirst first;

    /**
     * Match by Name
     */
    @Autowired
    private Dependency dependencyFirst;

    @Autowired
    private Dependency dependencySecond;

    @Autowired
    private Dependency dependencyThree;

    /**
     * Match by Qualifier
     */
    @Autowired
    @Qualifier("dependencyFirst")
    private Dependency dependency;

    public void printFirstMessage() {
        System.out.print("By Type:(DependencyFirst first)           : ");
        first.printMessage();

        System.out.print("By Name:(Dependency dependencyFirst)      : ");
        dependencyFirst.printMessage();
        System.out.print("By Name(Dependency dependencySecond)      : ");
        dependencySecond.printMessage();

        System.out.print("By @Bean: (Dependency dependencyThree())  : ");
        dependencyThree.printMessage();

        System.out.print("By @Qualifier(\"dependencyFirst\")          : ");
        dependency.printMessage();
    }
}
