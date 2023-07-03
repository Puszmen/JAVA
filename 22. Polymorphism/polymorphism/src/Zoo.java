import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {

//        Animal[] animals = new Animal[3];
//        animals [0] = new Animal("Kotopies");
//        animals [1] = new Cat("Bimbo");
//        animals [2] = new Dog("Pimpek");
//
//        changeAnimalName(animals[1], "Koteł");
//        changeAnimalName(animals[2], "Pieseł");
//
//        for (Animal animal : animals) {
//            animal.giveSound();
//        }
//    private static void changeAnimalName (Animal animal, String newName) {
//        animal.setName(newName);

//        Animal cat = new Cat("Bimbo");
//        Animal dog = new Dog("Pimpo");
//
//        Dog specificDog = (Dog) dog;
//        specificDog.bark();
//
//        ((Cat) cat).meow();

        Animal animal = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Kot, 2 - Pies");
        int option = scanner.nextInt();

        if (option == 1) {
            animal = new Cat("Mruczek");
        } else if (option == 2) {
            animal = new Dog("Burek");
        }

        if (animal instanceof Cat) {
            ((Cat) animal).meow();
        } else {
            ((Dog) animal).bark();
        }

    }
}
