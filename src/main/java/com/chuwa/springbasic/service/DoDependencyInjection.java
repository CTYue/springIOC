package com.chuwa.springbasic.service;

import com.chuwa.springbasic.components.Dependency;
import com.chuwa.springbasic.components.impl.DependencyImplFirst;
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
    private DependencyImplFirst first;

    /**
     * Match by Name
     */
    @Autowired
    private Dependency dependencyImplFirst;

    @Autowired
    private Dependency dependencyImplSecond;

    @Autowired
    private Dependency dependencyImplThree;

    /**
     * Match by Qualifier
     */
    @Autowired
    @Qualifier("dependencyImplFirst")
    private Dependency dependency;

    public void printFirstMessage() {
        System.out.print("By Type:(DependencyFirst first)           : ");
        first.printMessage();

        System.out.print("By Name:(Dependency dependencyFirst)      : ");
        dependencyImplFirst.printMessage();
        System.out.print("By Name(Dependency dependencySecond)      : ");
        dependencyImplSecond.printMessage();

        System.out.print("By @Bean: (Dependency dependencyThree())  : ");
        dependencyImplThree.printMessage();

        System.out.print("By @Qualifier(\"dependencyFirst\")          : ");
        dependency.printMessage();
    }
}
