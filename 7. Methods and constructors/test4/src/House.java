public class House {
    double waterAmount;
    double oilAmount;
    House (double wA, double oA) {
        waterAmount = wA;
        oilAmount = oA;
    }
    void houseInfo () {
        System.out.println("Ilość wody: "+waterAmount+" litrów, ropa: "+oilAmount+" litrów.");
    }
    void takeShower () {
        System.out.println("Bierzemy prysznic");
        waterAmount = waterAmount - 48;
        houseInfo();
    }
    void takeBath () {
        System.out.println("Bierzemy kąpiel");
        waterAmount = waterAmount - 86;
        houseInfo();
    }
    void makeDinner () {
        System.out.println("Przyrządzamy obiad");
        waterAmount = waterAmount - 4;
        oilAmount = oilAmount - 0.1;
        houseInfo();
    }
    void boilWater () {
        System.out.println("Gotujemy wodę");
        waterAmount = waterAmount - 0.5;
        oilAmount = oilAmount - 0.05;
        houseInfo();
    }
    void watchTv (int hour) {
        System.out.println("Oglądamy telewizję przez "+hour+" godziny");
        double fuelConsumption = hour * 0.06;
        oilAmount = oilAmount - fuelConsumption;
        houseInfo();
    }
}
