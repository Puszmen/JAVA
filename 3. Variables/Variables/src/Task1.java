public class Task1 {
    public static void main(String[] args) {

        String brand;
        String model;
        String productionDate;
        double price;
        final boolean accidentFree = true;

        brand = "Opel";
        model = "Astra";
        productionDate = "2006";
        price = 15000;

        System.out.print("My personal car: " + brand);
        System.out.print(" ");
        System.out.print(model);
        System.out.print(" ");
        System.out.print(productionDate);
        System.out.print(", price of the car: ");
        System.out.print(price);
        System.out.println(", car is accidental free: " + accidentFree);

        brand = "Chevrolet";
        model = "Spark";
        productionDate = "2014";
        price = 16000;

        System.out.println("My second car: " + brand + " " + model +" " + productionDate + ", price of the car: " + price);


    }
}
