import java.util.SortedMap;

public class CarShop {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.brand = "Opel";
        car1.model = "Astra";
        car1.color = "Czarny";
        car1.wheelsColor = "Srebrny";
        car1.tyresColor = "Czarny";
        car1.doors = 5;
        String car1Info = car1.brand + ", model: "+ car1.model+", kolor: "+car1.color+", liczba drzwi: "+ car1.doors;

        Car car2 = new Car();
        car2.brand = "Chevrolet";
        car2.model = "Spark";
        car2.color = "Czarny";
        car2.wheelsColor = "Biały";
        car2.tyresColor = "Srebrny";
        car2.doors = 5;
        
        System.out.println(car1Info);
        System.out.println();
        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.doors);

    }
}
