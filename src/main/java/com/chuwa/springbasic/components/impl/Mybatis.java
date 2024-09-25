package com.chuwa.springbasic.components.impl;

import com.chuwa.springbasic.components.JpaChuwa;
import org.springframework.stereotype.Component;

@Component("mybatis")
public class Mybatis implements JpaChuwa {
    @Override
    public void printMessage() {
        System.out.println("Message from " + getClass().getName());
    }
}
