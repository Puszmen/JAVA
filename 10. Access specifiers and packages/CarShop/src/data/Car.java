package data;

public class Car {
    private int year;
    private String brand;
    private String model;
    private String color;
    public Car (int carYear,String carBrand, String carModel, String carColor) {
        this (carYear, carBrand, carModel);
        this.color = carColor;
    }
    public Car (int carYear,String carBrand, String carModel) {
        this.year = carYear;
        this.brand = carBrand;
        this.model = carModel;
    }
    public String carInfo() {
        return brand+" "+model+", rok produkcji: "+year+", kolor: "+color;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}