public class DataStore {

    private static final int MAX_COMPUTERS = 100;

    Computer[] computers = new Computer[MAX_COMPUTERS];
    private int computerNumber;

    public Computer[] getComputers() {
        Computer[] comp = new Computer[computerNumber];
        for (int i = 0; i < computerNumber; i++) {
            comp[i] = computers[i];
        }
        return comp;
    }

    public void add (Computer computer) {
        if (computerNumber < MAX_COMPUTERS && computer != null) {
            computers[computerNumber] = computer;
            computerNumber++;
        }
    }

    public int checkAvailability(Computer find) {
        if (find == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < computerNumber; i++) {
            if (find.equals(computers[i])) {
                count++;
            }
        }
        return count;
    }
}
