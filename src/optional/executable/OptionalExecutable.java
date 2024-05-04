package optional.executable;

import java.util.List;
import java.util.Optional;

public class OptionalExecutable {
    public static void main(String[] args) {
        understandOptional();
    }

    private static void understandOptional() {
        List<Person> people = List.of(new Person("John", "Smith"), new Person("Jade", "Mark"), new Person("Julie",
                "Linda"));
        Optional<Person> optionalPerson = findPersonByFirstName("Julie", people);
        optionalPerson.ifPresentOrElse(OptionalExecutable::doSomethingWithPerson, optionalPerson::orElseThrow);
    }

    private static void doSomethingWithPerson(Person person) {
        System.out.println(person.firstName);
    }

    private static Optional<Person> findPersonByFirstName(String firstName, List<Person> people) {
        return people.stream().filter(person -> person.firstName.equals(firstName)).findAny();
    }

    record Person(String firstName, String lastName) {
    }
}
