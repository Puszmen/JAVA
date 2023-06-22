public class Test {
    public static void main(String[] args) {

        Tire tire1 = new Tire(16,40,"1230","Goodwin","Slim","X");
        tire1.printInfo();
        System.out.println();

        ExhaustPart exhaustPart1 = new ExhaustPart(true,"3584","Saburo",
                "Dry","Y");
        exhaustPart1.printInfo();
    }
}
