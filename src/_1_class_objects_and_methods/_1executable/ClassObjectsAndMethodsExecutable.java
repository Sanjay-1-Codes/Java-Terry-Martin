package _1_class_objects_and_methods._1executable;

import _1_class_objects_and_methods._2model.Address;
import _1_class_objects_and_methods._2model.Dog;
import _1_class_objects_and_methods._2model.Person;
import _1_class_objects_and_methods._2model.Pet;

import java.time.LocalDate;
import java.util.HashMap;

public class ClassObjectsAndMethodsExecutable {

    public static void main(String[] args) {
        understandModellingOfObjects();
        understandVarKeyword();
        understandArrays();
    }

    /**
     * Ways of declaring, creating and initializing the array
     */
    private static void understandArrays() {
        //Declaration and Creation
        int[] nums = new int[5];
        // Initialization
        nums[0] = 21;

        //Declaration, Creation and Initialization
        int[] nums2 = {1, 3, 1, 5};

        //Anonymous Array
        int[] nums3 = new int[]{5, 2, 6};


    }

    /**
     * If we are declaring and initializing a local variable in the same line, then there's no need to specify the
     * type of the variable ,instead we can use var keyword, javac can infer it on its own
     */
    private static void understandVarKeyword() {
        var name = "Jake";
        var employeesById = new HashMap<>(); // No type safety - Map<Object, Object>
    }

    /**
     * While printing an object, toString() is called on the object, if not overridden (at the class level or its
     * parent class level) Object class toString() is called which gives
     * fullyQualifiedClassName@hexadecimalRepresentationOfObjectLocation
     */
    private static void understandModellingOfObjects() {
        //While printing dog - since toString() is not present it goes bottom up to search toString() method and once
        // it finds in the Pet class it uses it to print

        Pet pet = new Dog("Fido", LocalDate.of(2023, 5, 12), "Domestic");
        Address address = new Address("No 22 , First Lane", "Second Street", "Chennai", "TamilNadu", "India", 600068L);
        Person jade = new Person("Jade", "Julia", LocalDate.of(1999, 10, 12), address, null, pet);
        Person winston = new Person("Winston", "Churchill", LocalDate.of(1999, 6, 27), address, jade, pet);
        System.out.println(winston);
    }
}
