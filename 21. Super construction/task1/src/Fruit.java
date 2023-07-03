public class Fruit {

    private int weight;
    private String fruitType;

    public Fruit(int weight, String fruitType) {
        this.weight = weight;
        this.fruitType = fruitType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getFruitType() {
        return fruitType;
    }

    public void setFruitType(String fruitType) {
        this.fruitType = fruitType;
    }

    public String getInfo () {
        return "Waga: " + getWeight() + ", typ: " + getFruitType();
    }
}
