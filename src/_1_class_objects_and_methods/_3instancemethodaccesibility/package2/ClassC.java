package _1_class_objects_and_methods._3instancemethodaccesibility.package2;

public class ClassC {
    public static void main(String[] args) {
        ClassB classB = new ClassB();
        classB.publicMethod();
        classB.protectedMethod();
        classB.packageProtectedMethod();
    }
}
