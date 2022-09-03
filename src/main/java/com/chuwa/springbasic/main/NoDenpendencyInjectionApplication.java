package com.chuwa.springbasic.main;

import com.chuwa.springbasic.service.NoDependencyInjection;

public class NoDenpendencyInjectionApplication {

    public static void main(String[] args) {
        NoDependencyInjection app = new NoDependencyInjection();
        app.printFirstMessage();
    }

}
