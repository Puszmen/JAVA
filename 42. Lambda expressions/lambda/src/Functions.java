import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Functions {
    public static void main(String[] args) {

        String original = "   WIELKI NAPIS   ";
        Function<String, String> func = s -> s.toLowerCase().trim();
        String changed = func.apply(original);

        Consumer<String> print3Times = s -> {
            System.out.println(s);
            System.out.println(s);
            System.out.println(s);
        };
        print3Times.accept(changed);

        int check = 19;
        Predicate<Integer> checkIfAdult = age -> age >= 18;
        boolean ageTest = checkIfAdult.test(check);
        if (ageTest) {
            System.out.println("Osoba pełnoletnia");
        } else {
            System.out.println("Osoba niepełnoletnia");
        }

        String[] firstNames = {"Zdzisław", "Wiesław", "Bronisław"};
        String[] lastNames = {"Kołek", "Wałek", "Korek"};
        int[] ages = {59, 62, 69};
        Random random = new Random();

        Supplier<Person> randomPersonGenerator = () -> {
            String firstName = firstNames[random.nextInt(firstNames.length)];
            String lastName = lastNames[random.nextInt(lastNames.length)];
            int age = ages[random.nextInt(ages.length)];
            return new Person(firstName,lastName,age);
        };

        Person randomPerson = randomPersonGenerator.get();
        System.out.println(randomPerson);

    }
}
