public class Bank {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.firstName = "Jan";
        person1.lastName = "Kowalski";
        person1.pesel = "123456789";

        person2.firstName = "Marta";
        person2.lastName = "Kowalska";
        person2.pesel = "987654321";

        BankAccount account1 = new BankAccount();
        account1.owner = person1;
        account1.balance = 10_000;

        BankAccount account2 = new BankAccount();
        account2.owner = person2;
        account2.balance = 5_000;

        Credit credit1 = new Credit();
        credit1.borrower = person1;
        credit1.cashBorrowed = 5000;
        credit1.cashReturned = 0;
        credit1.interestRate = 0.10;
        credit1.termMonth = 12;

        Adress address1 = new Adress();
        address1.houseNumber = 10;
        address1.city = "Warszawa";
        address1.street = "Rolnicza";
        address1.zipNumber = "20-000";
        person1.registeredAdress = address1;
        person1.residentialAdress = address1;

        Adress address2 = new Adress();
        address2.houseNumber = 10;
        address2.city = "Kraków";
        address2.street = "Rolnicza";
        address2.zipNumber = "30-000";
        person2.residentialAdress = address1;
        person2.registeredAdress = address2;

        System.out.println("Osoba 1:");
        System.out.println(person1.firstName+" "+person1.lastName);
        System.out.println("Mieszka w miejscowosci: "+person1.residentialAdress.city);
        System.out.println("Posiada konto bankowe z kwota: "+account1.balance+" zł");
        System.out.println("");
        System.out.println("Osoba 2:");
        System.out.println(person2.firstName+" "+person2.lastName);
        System.out.println("Mieszka w miejscowosci: "+person2.registeredAdress.city);
        System.out.println("Posiada konto bankowe z kwota: "+account2.balance+" zł");
    }
}
