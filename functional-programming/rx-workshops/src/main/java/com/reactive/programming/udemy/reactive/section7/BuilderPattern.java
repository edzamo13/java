package com.reactive.programming.udemy.reactive.section7;

import com.reactive.programming.udemy.reactive.section7.exampleMethod.builderPattern.MobileBuilder;

public class BuilderPattern {
    public static void main(String[] args) {

        MobileBuilder builder = new MobileBuilder();
        builder.with(builder1 ->{
         //   builder1.ram=4;
        }).createMobile();
    }

}
