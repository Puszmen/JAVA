public class NotebookShop {

    public static void main(String[] args) {

        DataStore dataStore = new DataStore();

        dataStore.add(new Computer("ASUS",1000));
        dataStore.add(new Computer("ASUS",1000));
        dataStore.add(new Computer("ASUS",1000));
        dataStore.add(new Computer("ERAZER",1300));
        dataStore.add(new Computer("ERAZER",1300));

        Computer compToCompare = new Computer("ASUS",1000);

        int countComputers = dataStore.checkAvailability(compToCompare);
        System.out.println("Ilość takich samych komputerów: " + countComputers);

        System.out.println("Lista komputerów " + compToCompare + " takich samych w sklepie: " + countComputers);
        for (Computer comp : dataStore.getComputers()) {
            System.out.println(comp);
        }
    }
}
