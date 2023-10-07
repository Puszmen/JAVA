public class Test {
    public static void main(String[] args) {

        Person[] people = {
                new Person("Jan", "Nowak"),
                new Person("Piotr", "Zalewski")
        };
        Person jNowak = people[0];
        System.out.println(jNowak);
    }
}
