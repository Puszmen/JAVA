import java.lang.Math;
import java.util.SortedMap;

public class GardenWatering {
    public static void main(String[] args) {
        Plant flower1 = new Plant();
        Plant flower2 = new Plant();
        Plant flower3 = new Plant();
        Plant flower4 = new Plant();

        flower1.name = "Zamiokulkas";
        flower1.description = "Osiąga nawet 100 cm wysokości, gromadzi wodę.";
        flower1.dayWaterDemand = 0.2;

        flower2.name = "Kroton";
        flower2.description = "Osiąga nawet 150 cm wysokości, lubi pokojową temperaturę.";
        flower2.dayWaterDemand = 0.5;

        flower3.name = "Juka";
        flower3.description = "Osiąga nawet 120 cm wysokości, rośnie powoli (rocznie ok. 20 cm).";
        flower3.dayWaterDemand = 0.1;

        flower4.name = "Filodendron";
        flower4.description = "Osiąga nawet 130 cm wysokości, roślina doniczkowa.";
        flower4.dayWaterDemand = 0.4;

        double weekWaterDemand1 = flower1.dayWaterDemand * 7;
        double yearWaterDemand1 = flower1.dayWaterDemand * 365;

        double weekWaterDemand2 = flower2.dayWaterDemand * 7;
        double yearWaterDemand2 = flower2.dayWaterDemand * 365;

        double weekWaterDemand3 = flower3.dayWaterDemand * 7;
        double yearWaterDemand3 = flower3.dayWaterDemand * 365;

        double weekWaterDemand4 = flower4.dayWaterDemand * 7;
        double yearWaterDemand4 = flower4.dayWaterDemand * 365;

        System.out.println("Nazwa rośliny: "+flower1.name);
        System.out.println("Krótki opis: "+flower1.description);
        System.out.println("Dzienne zapotrzebowanie na wodę: "+flower1.dayWaterDemand+"l");
        System.out.println("Tygodniowe zapotrzebowanie na wodę: "+weekWaterDemand1+"l");
        System.out.println("Roczne zapotrzebowanie na wodę: "+yearWaterDemand1+"l");
        System.out.println();
        System.out.println("Nazwa rośliny: "+flower2.name);
        System.out.println("Krótki opis: "+flower2.description);
        System.out.println("Dzienne zapotrzebowanie na wodę: "+flower2.dayWaterDemand+"l");
        System.out.println("Tygodniowe zapotrzebowanie na wodę: "+weekWaterDemand2+"l");
        System.out.println("Roczne zapotrzebowanie na wodę: "+yearWaterDemand2+"l");
        System.out.println();
        System.out.println("Nazwa rośliny: "+flower3.name);
        System.out.println("Krótki opis: "+flower3.description);
        System.out.println("Dzienne zapotrzebowanie na wodę: "+flower3.dayWaterDemand+"l");
        System.out.println("Tygodniowe zapotrzebowanie na wodę: "+weekWaterDemand3+"l");
        System.out.println("Roczne zapotrzebowanie na wodę: "+yearWaterDemand3+"l");
        System.out.println();
        System.out.println("Nazwa rośliny: "+flower4.name);
        System.out.println("Krótki opis: "+flower4.description);
        System.out.println("Dzienne zapotrzebowanie na wodę: "+flower4.dayWaterDemand+"l");
        System.out.println("Tygodniowe zapotrzebowanie na wodę: "+weekWaterDemand4+"l");
        System.out.println("Roczne zapotrzebowanie na wodę: "+yearWaterDemand4+"l");

    }
}
