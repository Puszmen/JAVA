public class Formatting {

    public static void main(String[] args) {

        String firstName = "Jan";
        String secondName = "Kowalski";
        int age = 25;
        char gender = 'M';
        double height = 1.79;

//        %b = boolean;
//        %c = char;
//        %d = decimal;
//        %f = float;
//        %s = String;

        System.out.printf("imię: %2$s, nazwisko: %3$s, wiek: %4$d, płeć: %5$c, wzrost: %1$f%n",
                height, firstName, secondName, age, gender
        );

//        String format = "imię: %s, nazwisko: %s, wiek: %d, płeć: %c, wzrost: %f%n";
//        String output = format.formatted(firstName, secondName, age, gender, height);
//        System.out.println(output);
//        System.out.println("Koniec");
    }
}
