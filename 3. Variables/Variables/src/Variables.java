public class Variables {
    public static void main(String[] args) {
        String firstName = "John"; // lowerCamelCase - how to name variables
        var lastName = "Smith";
        int age = 25;
        double height = 180;
        final String idCode = "123456789";



        // first step is to "declare" variables: String, int, double etc.
        // second step is "initialization"(value of variable): for String is "John", int is "25" etc.
        // Declaration than initialization :)
        // variables we can change but word "final" says that this value we cant change
        // var variable saying that JAVA will declare automatically type of variable, it depends value of variable


        System.out.println(firstName + " " + lastName + " have " + age + " years.");
        System.out.println("Mr " + lastName + " id number " + idCode);
        System.out.println(firstName + " height is " + height);
        System.out.println("If " + firstName + " grows 5cm, he will have " + (height+5) + "cm.");
        firstName = "Steve";
        System.out.println("Name after change: " + firstName);
    }
}
