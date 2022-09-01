package com.chuwa.springbasic.service;

import com.chuwa.springbasic.components.JpaChuwa;
import com.chuwa.springbasic.components.impl.HibernateChuwa;
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
     * 变量名您可以随意取
     */
    @Autowired
    private HibernateChuwa hibernate;

    /**
     * Match by Name
     * 变量名必须是某个子类的名称，且首字母小写,
     * 如果是来自于@Bean,则用的是方法名小写。
     */
    @Autowired
    private JpaChuwa hibernateChuwa;

    @Autowired
    private JpaChuwa eclipsedLinkChuwa;

    @Autowired
    private JpaChuwa myDataNucleus;

    /**
     * wrong
     * NoUniqueBeanDefinitionException: No qualifying bean of type 'com.chuwa.springbasic.components.JpaChuwa'
     * available: expected single matching bean but found 3: eclipsedLinkChuwa,hibernateChuwa,myDataNucleus
     */
//    @Autowired
//    private JpaChuwa jpaChuwa;


    /**
     * Match by Qualifier
     * 变量名您随意起
     */
    @Autowired
    @Qualifier("hibernateChuwa")
    private JpaChuwa jpaChuwaQualifier;

    public void printFirstMessage() {
        System.out.print("By Type(HibernateChuwa hibernate)         : ");
        hibernate.printMessage();

        System.out.print("By Name(JpaChuwa hibernateChuwa)          : ");
        hibernateChuwa.printMessage();
        System.out.print("By Name(JpaChuwa eclipsedLinkChuwa)       : ");
        eclipsedLinkChuwa.printMessage();

        System.out.print("By Name and @Bean:(myDataNucleus())       : ");
        myDataNucleus.printMessage();

        System.out.print("By @Qualifier(\"hibernateChuwa\")         : ");
        jpaChuwaQualifier.printMessage();
    }
}
