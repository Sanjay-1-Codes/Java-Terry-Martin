package _1_class_objects_and_methods.model;

import java.time.LocalDate;

public class Dog extends Pet {

    private String type;

    public Dog(String name, LocalDate dob, String type) {
        super(name, dob);
        this.type = type;
    }

    public void bark() {
        System.out.println("Woof Woof!");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
