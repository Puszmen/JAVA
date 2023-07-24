public class Formatting1 {
    public static void main(String[] args) {

//        double number = 123.4567890;
//        System.out.printf("%.2f", number);

//        int number1 = 123;
//        System.out.printf("%5d%n",number1);
//
//        double number2 = 123.456;
//        System.out.printf("%10.2f%n", number2);
//
//        String name = "Jan";
//        System.out.printf("%12s", name);

        double positiveNumber = 123.123465;
        System.out.printf("%+.2f%n", positiveNumber);

        double negativeNumber = -132.654887;
        System.out.printf("%(010.2f%n", negativeNumber);

        int bigNumber = 123456789;
        System.out.printf("%,d%n", bigNumber);

        String name1 = "Anna";
        String name2 = "Jan";
        int age1 = 21;
        int age2 = 23;
        System.out.printf("%-20s%s%n", "Imię:", "Wiek:");
        System.out.printf("%-20s%d%n", name1, age1);
        System.out.printf("%-20s%d%n", name2, age2);

    }
}
