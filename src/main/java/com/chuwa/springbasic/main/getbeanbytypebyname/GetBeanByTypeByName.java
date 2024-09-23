package com.chuwa.springbasic.main.getbeanbytypebyname;

import com.chuwa.springbasic.config.BeanConfig;
import com.chuwa.springbasic.main.DITypes.DependencyInjectionTypesConstructorAndFieldAndSetter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author b1go
 * @date 9/5/22 12:35 AM
 */
public class GetBeanByTypeByName {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        /**
         * 1. Retrieving Bean by Name and Type
         * 2. Retrieving Bean by Name
         * 3. Retrieving Bean by Type
         */
        System.out.println("\n ******  1. Retrieving Bean by Name and Type *****");
        // 1. Retrieving Bean by Name and Type
        context.getBean("dependencyInjectionByTypeByName", DependencyInjectionByTypeByName.class).printFirstMessage();

        System.out.println("\n ******  2. Retrieving Bean by Name *****");
        // 2. Retrieving Bean by Name
        Object o = context.getBean("dependencyInjectionByTypeByName");
        DependencyInjectionByTypeByName di = (DependencyInjectionByTypeByName) o;
        di.printFirstMessage();

        System.out.println("\n ******  or *****");
        // or
        ((DependencyInjectionByTypeByName) context.getBean("dependencyInjectionByTypeByName")).printFirstMessage();

        // 3. Retrieving Bean by Type
        System.out.println("\n ******  3. Retrieving Bean by Type *****");
        context.getBean(DependencyInjectionByTypeByName.class).printFirstMessage();



        System.out.println("\n ******  1. Retrieving Bean by Name and Type *****");
        // 1. Retrieving Bean by Name and Type
        context.getBean("dependencyInjectionTypesConstructorAndFieldAndSetter", DependencyInjectionTypesConstructorAndFieldAndSetter.class).printMessage();

        System.out.println("\n ******  2. Retrieving Bean by Name *****");
        // 2. Retrieving Bean by Name
        o = context.getBean("dependencyInjectionTypesConstructorAndFieldAndSetter");
        DependencyInjectionTypesConstructorAndFieldAndSetter di1 = (DependencyInjectionTypesConstructorAndFieldAndSetter) o;
        di1.printMessage();

        System.out.println("\n ******  or *****");
        // or
        ((DependencyInjectionTypesConstructorAndFieldAndSetter) context.getBean("dependencyInjectionTypesConstructorAndFieldAndSetter")).printMessage();

        // 3. Retrieving Bean by Type
        System.out.println("\n ******  3. Retrieving Bean by Type *****");
        context.getBean(DependencyInjectionTypesConstructorAndFieldAndSetter.class).printMessage();
    }
}
