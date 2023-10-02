import java.util.HashSet;

public class PersonSet {
    public static void main(String[] args) {

        HashSet<Person> people = new HashSet<>();

        people.add(new Person("Jan", "Kowalski"));
        people.add(new Person("Jan", "Kowalski"));
        people.add(new Person("Zofia", "Malec"));
        people.add(new Person("Maciej", "Wieczorek"));

        System.out.println(people);
        System.out.println("people.size(): " + people.size());
        System.out.println("contains Jan Kowalski ? " + people.contains(new Person("Jan", "Kowalski")));
        System.out.println(people.remove(new Person("Zofia", "Malec")));
        System.out.println("people.size(): " + people.size());

    }
}
