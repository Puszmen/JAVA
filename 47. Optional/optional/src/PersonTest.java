import java.util.Optional;

class PersonTest {
    public static void main(String[] args) {
        PersonDatabase db = new PersonDatabase();
        db.add(new Person(1, "Jan", "Kowalski"));
        db.add(new Person(2, "Karol", "Zawadzki"));
        db.add(new Person(3, "Bartosz", "Abacki"));
        db.add(new Person(4, "Ania", "Walczak"));

        Optional<Person> optPerson1 = db.findById(2);
        optPerson1.ifPresent(PersonTest::printLastName);

        String lastNameById = db.findLastNameById(55);
        System.out.println(lastNameById);

    }
    private static void printLastName (Person person) {
        System.out.println(person.getLastName());
    }

}
