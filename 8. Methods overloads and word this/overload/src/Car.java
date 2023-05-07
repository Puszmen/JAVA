public class Car {
    int year;
    String brand;
    String model;
    String color;
    Car (int carYear,String carBrand, String carModel, String carColor) {
        this (carYear, carBrand, carModel);
        this.color = carColor;
    }
    Car (int carYear,String carBrand, String carModel) {
        this.year = carYear;
        this.brand = carBrand;
        this.model = carModel;
    }
    String carInfo() {
        return brand+" "+model+", rok produkcji: "+year+", kolor: "+color;
    }
}