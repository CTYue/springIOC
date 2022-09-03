package com.chuwa.springbasic.main;

import com.chuwa.springbasic.components.impl.HibernateChuwa;
import com.chuwa.springbasic.service.NoDependencyInjectionAggregation;

public class NoDenpendencyInjectionAggregationApplication {

    public static void main(String[] args) {
        /**
         * 我们想用哪个，就在构造器里放哪个。
         */
        NoDependencyInjectionAggregation app = new NoDependencyInjectionAggregation(new HibernateChuwa());
        app.printFirstMessage();
    }

}
