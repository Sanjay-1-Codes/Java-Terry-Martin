package _1_class_objects_and_methods.executable;

import _1_class_objects_and_methods.model.Address;
import _1_class_objects_and_methods.model.Dog;
import _1_class_objects_and_methods.model.Person;
import _1_class_objects_and_methods.model.Pet;

import java.time.LocalDate;

public class ClassObjectsAndMethodsExecutable {
    public static void main(String[] args) {
        understandModellingOfObjects();
    }

    /**
     * While printing an object, toString() is called on the object, if not overridden (at the class level or its
     * parent class level) Object class toString() is called which gives
     * fullyQualifiedClassName@hexadecimalRepresentationOfObject
     */
    public static void understandModellingOfObjects() {
        //While printing dog - since toString() is not present it goes bottom up to search toString() method and once
        // it finds in the Pet class it uses it to print
        Pet pet = new Dog("Fido", LocalDate.of(2023, 5, 12), "Domestic");
        Address address = new Address("No 22 , First Lane", "Second Street", "Chennai", "TamilNadu", "India", 600068L);
        Person jade = new Person("Jade", "Julia", LocalDate.of(1999, 10, 12), address, null, pet);
        Person winston = new Person("Winston", "Churchill", LocalDate.of(1999, 6, 27), address, jade, pet);
        System.out.println(winston);
    }
}