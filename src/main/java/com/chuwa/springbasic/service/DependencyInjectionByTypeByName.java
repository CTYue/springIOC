package com.chuwa.springbasic.service;

import com.chuwa.springbasic.components.JpaChuwa;
import com.chuwa.springbasic.components.impl.HibernateChuwa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author b1go
 * @date 9/1/22 12:12 AM
 *
 * 1. 如果只有一个impl,则默认用这个impl
 * 2. 如果有多个impl, 则按变量名寻找，若找到，则用它。
 * 3. 如果有多个impl,按变量名不能确定用哪一个，then check @primary，若有，则用primary
 *                                                           若无，则报错
 */
@Component
public class DependencyInjectionByTypeByName {
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
    private JpaChuwa eclipseLinkChuwa;

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
        eclipseLinkChuwa.printMessage();

        System.out.print("By Name and @Bean:(myDataNucleus())       : ");
        myDataNucleus.printMessage();

        System.out.print("By @Qualifier(\"hibernateChuwa\")         : ");
        jpaChuwaQualifier.printMessage();
    }
}
