package _1_class_objects_and_methods._3instancemethodaccesibility.package1;

import _1_class_objects_and_methods._3instancemethodaccesibility.package2.ClassB;

public class ClassA extends ClassB{

    public static void main(String[] args) {
        ClassB classB = new ClassB();
        classB.publicMethod();
    }

    public void accessingProtectedMethod() {
        super.protectedMethod();
    }
}
