public class Elevator {
    private Person[] people = new Person[4];
    private int peopleNumber = 0;
    private final int maximumWeight = 400;

    void add (Person person) {
        if (peopleNumber < 4) {
            people[peopleNumber] = person;
            peopleNumber++;
        } else {
            System.out.println("Proszę poczekać w windzie nie ma już miejsca");
        }
    }

    private int getTotalWeight () {
        int totalWeight = 0;
        if (people[0] != null) {
            totalWeight += people[0].getWeight();
        } if (people[1] != null) {
            totalWeight += people[1].getWeight();
        } if (people[2] != null) {
            totalWeight += people[2].getWeight();
        } if (people[3] != null) {
            totalWeight += people[3].getWeight();
        }
        return totalWeight;
    }
    private boolean weightIsCorrect () {
        return getTotalWeight() <= maximumWeight;
    }

    void start () {
        if (weightIsCorrect()) {
            System.out.println("Winda ruszyła");
        } else {
            int overload = getTotalWeight() - maximumWeight;
            System.out.println("Winda jest przeciążona o "+overload+" kg");
        }
    }

    void clear () {
        people = new Person[4];
        peopleNumber = 0;
        System.out.println("Winda jest pusta");
    }
}