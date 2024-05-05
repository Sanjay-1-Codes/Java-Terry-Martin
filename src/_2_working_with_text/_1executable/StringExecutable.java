package _2_working_with_text._1executable;

import static java.lang.StringTemplate.STR;

public class StringExecutable {

    public static void main(String[] args) {
        understandStringCreation();
        understandStringCasing();
        understandStringBlankAndEmpty();
        understandStringReplace();
        understandStringWhitespaceRemoval();
        understandStringCharAt();
        understandStringCompareTo();
        understandStringContains();
        understandStringConcat();
        understandStringSubString();
        understandStringIndexOf();
        understandStringSplit();
        understandStringStartsEndsWith();
        understandStringContentEquals();
        understandStringTemplates();
    }

    private static void understandStringTemplates() {
        System.out.println("-- UNDERSTAND STRING TEMPLATE --");
        String firstName = "John";
        String lastName = "Smith";
        // StringTemplates - Interpolation of strings
        System.out.println(STR."His name is \{lastName}, \{firstName}");
    }

    private static void understandStringContentEquals() {
        System.out.println("-- UNDERSTAND STRING CONTENT EQUALS --");

        String comparingText = "Apple";
        String comparedText = "Apple";
        // equals() and contentEquals() both does the same job, but equals() strictly accepts String type alone but
        // contentEquals() accepts CharSequence(Parent class of String, StringBuilder, StringBuffer etc)
        System.out.println(comparingText.contentEquals(comparedText));
        System.out.println(comparingText.equals(comparedText));
    }

    private static void understandStringStartsEndsWith() {
        System.out.println("-- UNDERSTAND STRING STARTS ENDS WITH --");
        String fileName = "colours.txt";
        System.out.println(fileName.endsWith(".txt"));
        fileName = "segment001.txt";
        System.out.println(fileName.startsWith("segment"));
    }

    private static void understandStringSplit() {
        System.out.println("-- UNDERSTAND STRING SPLIT --");

        String fruits = "Apple,Banana,Guava,JackFruit";
        // Regex can be complex or straight forward as a simple string literal
        // split(regex)
        // split(regex, noOfOutputElementsInTheArray)
        String[] unlimitedFruitsArray = fruits.split(",");
        for (String fruit : unlimitedFruitsArray) {
            System.out.println(fruit);
        }
        System.out.println("---");
        String[] limitedFruitsArray = fruits.split(",", 2);
        for (String fruit : limitedFruitsArray) {
            System.out.println(fruit);
        }
    }

    private static void understandStringIndexOf() {
        System.out.println("-- UNDERSTAND STRING INDEX OF --");

        // indexOf() - tells us where inside the string a substring exists
        // indexOf(string)
        // indexOf(string, fromIndex)
        // indexOf(int characterUnicode)
        // indexOf(int characterUnicode, fromIndex)
        String statement = "Four score and seven years later";
        // Returns the start index of string mentioned if present else returns -1
        System.out.println(statement.indexOf("score"));

        // Split the string into three parts (Area code (234), Exchange(222), Line number(3331))
        String phoneNumber = "(234) 222-3331";
        String areaCode = parseCode(phoneNumber, PhoneCode.AREA_CODE);
        String exchangeCode = parseCode(phoneNumber, PhoneCode.EXCHANGE_CODE);
        String lineNumber = parseCode(phoneNumber, PhoneCode.LINE_CODE);
        System.out.println(areaCode);
        System.out.println(exchangeCode);
        System.out.println(lineNumber);
    }

    private static String parseCode(String phoneNumber, PhoneCode phoneCode) {
        // Switch Expression
        // Returns a value directly
        return switch (phoneCode) {
            case AREA_CODE -> phoneNumber.substring(phoneNumber.indexOf("(") + 1, phoneNumber.indexOf(")"));
            case EXCHANGE_CODE -> phoneNumber.substring(phoneNumber.indexOf(" ") + 1, phoneNumber.indexOf("-"));
            case LINE_CODE -> phoneNumber.substring(phoneNumber.indexOf("-") + 1);
        };
    }

    private static void understandStringSubString() {
        System.out.println("-- UNDERSTAND STRING SUB STRING --");
        String fruit = "apple";
        // Uppercase the first letter alone
        // subString() - overloaded method
        // subString(startIndexInclusive)
        // subString(startIndexInclusive, endIndexExclusive)
        String casedFruit = fruit.substring(0, 1).toUpperCase() + fruit.substring(1);
        System.out.println(casedFruit);
    }

    private static void understandStringConcat() {
        System.out.println("-- UNDERSTAND STRING CONCAT --");
        String firstName = "John";
        String lastName = "Smith";
        String fullName;

        // Concat using + operator
        fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // Concat using concat()
        fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName);

        // Concat using format()
        fullName = String.format("%s %s", firstName, lastName);
        System.out.println(fullName);

        // If we are concatenating two or three strings then the above three approaches are fine
        // But if are concatenating in a loop or so, then for each concatenation java creates a new string that
        // populates the heap space memory, which is not recommended

        //Concat using StringBuilder - Newer Version

        // In this method new Strings are not formed - the appended string is maintained as a byte array and when
        // toString() is called, its converted to String and returned to us
        // Not thread safe
        // Faster
        fullName = new StringBuilder(firstName)
                .append(" ")
                .append(lastName)
                .toString();
        System.out.println(fullName);

        // Concat using StringBuffer - Newer Version

        // In this method new Strings are not formed - the appended string is maintained as a byte array and when
        // toString() is called, its converted to String and returned to us
        // Thread safe
        // Slower
        fullName = new StringBuffer(firstName)
                .append(" ")
                .append(lastName)
                .toString();
        System.out.println(fullName);
    }

    private static void understandStringContains() {
        System.out.println("-- UNDERSTAND STRING CONTAINS --");
        String statement = "Four score and seven years later";
        System.out.println(statement.contains("score"));
        System.out.println(statement.contains("score "));
        System.out.println(statement.contains("score  "));
    }

    private static void understandStringCompareTo() {
        System.out.println("-- UNDERSTAND STRING COMPARE TO --");
        String firstWord = "Apple";
        String secondWord = "Banana";

        //compareTo()
        //instance1.compareTo(instance2)
        //Returns -ve if instance1 comes before instance2 alphabetically
        //Returns 0 if instance1 and instance2 are equal
        //Returns +ve if instance2 comes before instance1 alphabetically
        System.out.println(firstWord.compareTo(secondWord));
        //Converts all to Uppercase before comparing
        System.out.println(firstWord.compareToIgnoreCase(secondWord));
    }

    private static void understandStringCharAt() {
        System.out.println("-- UNDERSTAND STRING CHAR AT --");
        String name = "Micheal";
        //0 based index
        //Can throw StringIndexOutOfBoundsException
        System.out.println(name.charAt(2));
    }

    private static void understandStringWhitespaceRemoval() {
        System.out.println("-- UNDERSTAND STRING WHITESPACE REMOVAL --");
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
        System.out.println("-- UNDERSTAND STRING REPLACE --");
        String replaceableString = "Hello, how are you?";
        //Replace a character
        System.out.println(replaceableString.replace('h', 'H'));
        //Replace a string
        System.out.println(replaceableString.replace("you?", "you!!!?"));
    }

    private static void understandStringBlankAndEmpty() {
        System.out.println("-- UNDERSTAND STRING BLANK AND EMPTY --");
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
        System.out.println("-- UNDERSTAND STRING CASING --");
        String countryCode = "Ind";
        System.out.println(countryCode.toUpperCase());

        String name = "PRAthIk";
        System.out.println(name.toLowerCase());
    }

    private static void understandStringCreation() {
        System.out.println("-- UNDERSTAND STRING CREATION --");
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

    private enum PhoneCode {
        AREA_CODE,
        EXCHANGE_CODE,
        LINE_CODE
    }
}
