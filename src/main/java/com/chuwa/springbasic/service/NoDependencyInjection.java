package com.chuwa.springbasic.service;

import com.chuwa.springbasic.components.JpaChuwa;
import com.chuwa.springbasic.components.impl.HibernateChuwa;

/**
 * @author b1go
 * @date 9/1/22 12:12 AM
 */
public class NoDependencyInjection {

    /**
     * 如果想换成EclipsedLinkChuwa, 则需要改source code。
     * 如果我们项目比较大有很多new HibernateChuwa()，则要改很多。还可能会漏掉。
     */
    private JpaChuwa jpaChuwa = new HibernateChuwa();
//    private JpaChuwa jpaChuwa = new EclipsedLinkChuwa();

    public void printFirstMessage() {
        jpaChuwa.printMessage();
    }
}
