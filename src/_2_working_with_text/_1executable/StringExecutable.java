package _2_working_with_text._1executable;

public class StringExecutable {

    public static void main(String[] args) {
        understandStringCreation();
        understandStringCasing();
        understandStringBlankAndEmpty();
        understandStringReplace();
        understandStringWhitespaceRemoval();
        understandStringCharAt();
        understandStringCompareTo();
    }

    private static void understandStringCompareTo() {
    }

    private static void understandStringCharAt() {
        String name = "Micheal";
        //0 based index
        //Can throw StringIndexOutOfBoundsException
        System.out.println(name.charAt(2));
    }

    private static void understandStringWhitespaceRemoval() {
        String firstName = " Jake ";
        System.out.printf("The first name of the user is:'%s'%n", firstName);

        //Strip - Newer version
        //Removes both leading and trailing spaces
        System.out.printf("The first name of the user is:'%s'%n", firstName.strip());
        //Removes leading spaces
        System.out.printf("The first name of the user is:'%s'%n", firstName.stripLeading());
        //Removes trailing spaces
        System.out.printf("The first name of the user is:'%s'%n", firstName.stripTrailing());

        //Trim - Older version
        //Removes both leading and trailing spaces
        System.out.printf("The first name of the user is:'%s'%n", firstName.trim());


    }

    private static void understandStringReplace() {
        String replaceableString = "Hello, how are you?";
        //Replace a character
        System.out.println(replaceableString.replace('h', 'H'));
        //Replace a string
        System.out.println(replaceableString.replace("you?", "you!!!?"));
    }

    private static void understandStringBlankAndEmpty() {
        String emptyString = "";
        String blankString = " ";
        //isEmpty() simply tells if the length of the string is zero
        //isBlank() also checks if the content of the string is valid without all blank characters
        System.out.println(emptyString.isEmpty());
        System.out.println(emptyString.isBlank());
        System.out.println(blankString.isEmpty());
        System.out.println(blankString.isBlank());
    }

    private static void understandStringCasing() {
        String countryCode = "Ind";
        System.out.println(countryCode.toUpperCase());
        
        String name = "PRAthIk";
        System.out.println(name.toLowerCase());
    }

    private static void understandStringCreation() {
        String fruit = "apple";
        String anotherFruit = "apple";

        String vegetable = new String("broccoli");
        String anotherVegetable = new String("broccoli");

        //Due to the concept of string pool and immutable nature of string, no new address is created for the same
        // word while using string literal
        System.out.println(fruit == anotherFruit);

        //While using new keyword we are forcing java to create a new address for each literal we pass
        System.out.println(vegetable == anotherVegetable);
    }
}
