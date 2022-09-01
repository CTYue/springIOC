package com.chuwa.springbasic.main;

import com.chuwa.springbasic.service.DoDependencyInjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIocContainerApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        context.getBean("doDependencyInjection", DoDependencyInjection.class).printFirstMessage();

//        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
//        context.getBean("needDependency", NeedDependency.class).printFirstMessage();
    }

}
