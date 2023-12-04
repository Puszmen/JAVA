import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonDatabase {
    List<Person> people = new ArrayList<>();

    public void add (Person person) {
        if (person == null)
            throw new NullPointerException("Cannot add null reference");
        findById(person.getId()).ifPresent(p -> {
            throw new IllegalArgumentException("Object with such id already exists");
        });
        people.add(person);
    }

    public Optional<Person> findById (int id) {
        for (Person person : people) {
            if (person.getId() == id)
                return Optional.of(person);
        }
        return Optional.empty();
    }

    public String findLastNameById (int id) {
        return findById(id)
        .map(Person::getLastName)
        .orElse("Anonim");
    }
}
