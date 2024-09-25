package com.chuwa.springbasic.main.BeanScope;

import com.chuwa.springbasic.components.JpaChuwa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoBeanScope {
    @Autowired
    private JpaChuwa jpaChuwa1;
    @Autowired
    private JpaChuwa jpaChuwa2;
    @Autowired
    private JpaChuwa jpaChuwa3;

    public void print(){
        System.out.println("jpaChuwa1.toString: "+jpaChuwa1.toString());
        System.out.println("jpaChuwa2.toString: "+jpaChuwa2.toString());
        System.out.println("jpaChuwa3.toString: "+jpaChuwa3.toString());
    }
}
