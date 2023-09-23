public class Product implements Comparable<Product>{

    private String producer;
    private String name;
    private double price;

    public Product(String producer, String name, double price) {
        this.producer = producer;
        this.name = name;
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "producer='" + producer + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product p) {
        if (this.price > p.price)
            return 1;
        else if (this.price < p.price)
            return -1;
        int compareProducers = this.producer.compareTo(p.producer);
        if(compareProducers != 0)
            return compareProducers;
        return this.name.compareTo(p.name);
    }
//    public int compareTo(Product p) {
//        return this.name.compareTo(p.name);
//    }
}
