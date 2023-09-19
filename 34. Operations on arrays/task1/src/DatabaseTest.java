class DatabaseTest {
    public static void main(String[] args) {
        PersonDatabase database = new PersonDatabase();
        database.addPerson(new Person("Jan", "Kowalski", "12345"));
        database.addPerson(new Person("Ania", "Zalewska", "234567"));
        database.addPerson(new Person("Karol", "Piotrowski", "345678"));
        database.addPerson(new Person("Patryk", "Bielecki", "45678"));
        Person person = database.get(1);
        System.out.println(person);
        System.out.println(database);
        database.removePerson(new Person("Patryk", "Bielecki", "45678"));
        System.out.println(database);
    }
}