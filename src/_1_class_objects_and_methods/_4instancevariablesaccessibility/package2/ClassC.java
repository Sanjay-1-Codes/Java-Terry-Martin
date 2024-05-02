package _1_class_objects_and_methods._4instancevariablesaccessibility.package2;

public class ClassC {
    public static void main(String[] args) {

        ClassB classB = new ClassB();

        //Instance Methods
        classB.publicMethod();
        classB.protectedMethod();
        classB.packageProtectedMethod();

        //Instance Variables
        classB.publicVariable = "public";
        classB.protectedVariable = "protected";
        classB.packageProtectedVariable = "package protected";

    }
}
