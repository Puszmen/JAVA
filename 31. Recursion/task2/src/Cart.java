public class Cart {
    private static final int MAX_PRODUCTS = 10;
    private Product[] products = new Product[MAX_PRODUCTS];
    private int productsCounter;

    public void addProduct (Product product) {
        if (productsCounter < MAX_PRODUCTS) {
            products[productsCounter] = product;
            productsCounter++;
        }
    }

//    public double totalPrice () {
//        double price = 0;
//        for (int i = 0; i < productsCounter; i++) {
//            price += products[i].getPrice();
//        }
//        return price;
//    }

    public double totalCost() {
        return sumPrices(0);
    }

    private double sumPrices(int counter) {
        if (productsCounter == 0) {
            return 0;
        }
        else if (counter < (productsCounter - 1)) {
            return products[counter].getPrice() + sumPrices(++counter);
        } else
           return products[counter].getPrice();
    }
}
