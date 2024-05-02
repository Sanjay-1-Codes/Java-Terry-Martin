package _1_class_objects_and_methods._4instancevariablesaccessibility.package2;

public class ClassB {

    public String publicVariable;
    private String privateVariable;
    protected String protectedVariable;
     String packageProtectedVariable;

    /**
     * Can be accessed from anywhere the class is accessible
     */
    public void publicMethod() {
        System.out.println("This is the public method of classB .");
        privateMethod();
        privateVariable = "private";
    }

    /**
     * Can be accessed only within classB
     */
    private void privateMethod() {
        System.out.println("This is the private method of classB .");
    }

    /**
     * Can be accessed within package2 and subclasses of classB from a different package using super keyword
     */
    protected void protectedMethod() {
        System.out.println("This is the protected method of classB .");
    }

    /**
     * Can be accessed from only within package2
     */
    void packageProtectedMethod() {
        System.out.println("This is the package protected method of classB .");
    }
}
