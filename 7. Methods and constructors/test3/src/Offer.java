class Offer {
    Product product;
    double price;
    boolean special;
    Offer (Product p, double pr, boolean sp) {
        price = pr;
        special = sp;
        product = p;
    }
    void info () {
        System.out.println(product.name+" "+product.producer+" "+price+" zł, "
        +"oferta specjalna ? "+special);
    }
}