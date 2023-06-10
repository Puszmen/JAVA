public class World {
    public static void main(String[] args) {

        Human adam = new Human("Adam", 176.5);
        Human ewa = new Human("Ewa", 173.5);

        Human.avgHeight = (adam.getHeight() + ewa.getHeight()) / 2;

        System.out.println("Pierwsi ludzie na Ziemi:");
        System.out.println(adam.getName() + ", " + adam.getHeight() + " cm wzrostu");
        System.out.println(ewa.getName() + ", " + ewa.getHeight() + " cm wzrostu");

        System.out.println("Średni wzrost:");
        System.out.println(Human.avgHeight + " cm");
    }
}
