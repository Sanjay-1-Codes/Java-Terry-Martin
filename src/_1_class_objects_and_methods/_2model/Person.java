package _1_class_objects_and_methods._2model;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private Address address;
    private Person spouse;
    private Pet pet;

    public Person() {
    }

    public Person(String firstName, String lastName, LocalDate dob, Address address, Person spouse, Pet pet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.address = address;
        this.spouse = spouse;
        this.pet = pet;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person getSpouse() {
        return spouse;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", address=" + address +
                ", spouse=" + spouse +
                ", pet=" + pet +
                '}';
    }
}
