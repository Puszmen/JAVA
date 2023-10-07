import java.util.*;

public class NotebookStore {
    public static void main(String[] args) {

        Map<Notebook, Integer> notebooks = new HashMap<>();

        Map<String, Integer> people = Map.of("Jan", 12, "Piotr", 32, "Kinga", 28);
        System.out.println(people);

        notebooks.put(new Notebook("Lenovo", "B590"), 12);
        notebooks.put(new Notebook("Dell", "Inspiron0211A"), 2);
        notebooks.put(new Notebook("HP", "G2A33EA"), 19);
        notebooks.put(new Notebook("HP", "G2A33EA"), 8);
        notebooks.put(new Notebook("Dell", "XPS0091V"), 5);

        Set<Map.Entry<Notebook, Integer>> entries = notebooks.entrySet();
        for (Map.Entry<Notebook, Integer> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

//        notebooks.put("B590", new Notebook("Lenovo", "B590"));
//        notebooks.put("Inspiron0211A", new Notebook("Dell", "Inspiron0211A"));
//        notebooks.put("G2A33EA", new Notebook("HP", "G2A33EA"));
//        notebooks.put("XPS0091V", new Notebook("Dell", "XPS0091V"));
//
//        Set<Map.Entry<String, Notebook>> entries = notebooks.entrySet();
//        for (Map.Entry<String, Notebook> entry : entries) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }

//        String key = "G2A33EA";
//        Notebook notebook = notebooks.get(key);
//        System.out.println(notebook);
//        notebooks.remove("B590");
//        System.out.println(notebooks);

//        Set<String> keys = notebooks.keySet();
//        for (String key : keys) {
//            System.out.println(key + ": " + notebooks.get(key));
//        }

//        System.out.println(keys);
//        Collection<Notebook> values = notebooks.values();
//        System.out.println(values);

    }
}
