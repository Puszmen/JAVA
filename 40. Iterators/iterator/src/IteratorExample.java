import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {

//        Set<Integer> numbers= new LinkedHashSet<>();
//        numbers.add(45);
//        numbers.add(2);
//        numbers.add(34);
//        numbers.add(6);
//        numbers.add(12);
//        Iterator<Integer> iterator = numbers.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        List<String> names = new ArrayList<>();
        names.add("Kasia");
        names.add("Wojtek");
        names.add("Wojtek");
        names.add("Wojtek");
        names.add("Zosia");
        names.add("Tomek");
        names.add("Basia");
        names.add("Basia");

//        System.out.println(">> Pętla 1");
//        for (int i = 0; i < names.size(); i++) {
//            String name = names.get(i);
//            System.out.println(name);
//            if (name.equals("Basia")) {
//                names.remove("Basia");
//                i--;
//            }
//        }
//        System.out.println(names);

        System.out.println(">> Pętla 2");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
            if (name.equals("Wojtek")) {
                iterator.remove();
            }
        }
        System.out.println(names);

    }
}
