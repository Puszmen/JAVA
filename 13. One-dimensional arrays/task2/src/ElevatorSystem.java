public class ElevatorSystem {
    public static void main(String[] args) {
        Person person1 = new Person(1,150);
        Person person2 = new Person(2,120);
        Person person3 = new Person(3,100);
        Person person4 = new Person(4,80);
        Person person5 = new Person(5,60);
        Elevator elevator = new Elevator();
        elevator.add(person1);
        elevator.add(person2);
        elevator.add(person5);
        elevator.add(person3);

        elevator.start();
        elevator.clear();

        elevator.add(person1);
        elevator.add(person2);
        elevator.add(person4);
        elevator.start();
    }
}
