public class CarShop {
    public static void main(String[] args) {
        Car car1 = new Car(2006,"Opel","Astra","czarny");
        Car car2 = new Car(2006,"Opel","Astra");
        System.out.println(car1.carInfo());
        System.out.println(car2.carInfo());
    }
}
