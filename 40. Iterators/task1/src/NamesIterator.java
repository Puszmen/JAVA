import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class NamesIterator {

    public static void main(String[] args) {

        Map<String, Person> people = new TreeMap<>();

        people.put("Kowalski", new Person("Jan", "Kowalski", 29));
        people.put("Zawadzka", new Person("Anna", "Zawadzka", 22));
        people.put("Nurek", new Person("Tomasz", "Kurek", 85));
        people.put("Kos", new Person("Alicja", "Kos", 19));
        people.put("Paterska", new Person("Barbara", "Paterska", 52));

        Collection<Person> values = people.values();
        Iterator<Person> iterator = values.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
