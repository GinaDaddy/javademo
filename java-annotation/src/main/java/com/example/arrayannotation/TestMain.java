package com.example.arrayannotation;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        MyAnnotation annotation = mc.getClass().getAnnotation(MyAnnotation.class);
        System.out.println("annotation.count() = " + annotation.count());
        Arrays.stream(annotation.books()).forEach(System.out::println);
    }
}
