package com.example.inherited;

public class TestInherited {
    public static void main(String[] args) {
        ChildWithoutAnnotation c = new ChildWithoutAnnotation();
        MyInheritedAnnotation annotation = c.getClass().getAnnotation(MyInheritedAnnotation.class);
        System.out.println("If this child without annotation can be inherited from parent, it should be 10. value=" + annotation.value());
    }
}
