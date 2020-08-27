package com.example.helloworld;

import java.lang.reflect.Method;

public class TestCustomAnnotation {
    public static void main(String[] args) throws NoSuchMethodException {
        Hello h = new Hello();
        Method m = h.getClass().getMethod("sayHello");
        MyAnnotation myAnnotation = m.getAnnotation(MyAnnotation.class);
        System.out.println("myAnnotation.value() = " + myAnnotation.value());
    }
}
