public class Person {
    private int Id;
    private int weight;

    public Person(int id, int weight) {
        Id = id;
        this.weight = weight;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}