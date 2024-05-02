package _1_class_objects_and_methods._4instancevariablesaccessibility.package1;

import _1_class_objects_and_methods._4instancevariablesaccessibility.package2.ClassB;

public class ClassA extends ClassB {

    public static void main(String[] args) {
        ClassB classB = new ClassB();
        classB.publicMethod();
        classB.publicVariable = "public";
    }

    public void accessingProtectedMembers() {
        super.protectedMethod();
        super.protectedVariable = "protected";
    }
}
