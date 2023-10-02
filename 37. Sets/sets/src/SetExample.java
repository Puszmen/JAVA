import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {

//        HashSet<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(1);
//        set.add(2);
//        set.add(2);
//        set.add(3);
//        set.add(4);
//        System.out.println(set);

//        HashSet<String> strings = new HashSet<>();
//        strings.add("AA");
//        strings.add("DD");
//        strings.add("BB");
//        strings.add("AA");
//        strings.add("CC");
//        System.out.println(strings);

        TreeSet<Person> set = new TreeSet<>();
        set.add(new Person("Jan", "Kowalski"));
        set.add(new Person("Jan", "Kowalski"));
        set.add(new Person("Zofia", "Malec"));
        set.add(new Person("Maciej", "Wieczorek"));

        System.out.println("set.size(): " + set.size());
        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());
        System.out.println("contains Jan Kowalski ? " + set.contains(new Person("Maciej", "Wieczorek")));
        System.out.println("contains Zofia Malec ? " + set.contains(new Person("Zofia", "Malec")));
    }
}
