public class Bank {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.firstName = "Jan";
        person1.lastName = "Kowalski";
        person1.pesel = "123456789";

        BankAccount account1 = new BankAccount();
        account1.owner = person1;
        account1.balance = 10_000;

        Credit credit1 = new Credit();
        credit1.borrower = person1;
        credit1.cashBorrowed = 5000;
        credit1.cashReturned = 0;
        credit1.interestRate = 0.10;
        credit1.termMonth = 12;

        System.out.println("Osoba posiadająca konto: "+person1.firstName+" "+person1.lastName+" "+person1.pesel);
        System.out.println("Ilośc pieniędzy na koncie: "+account1.balance+" zł");
        System.out.println("Zaciągniety kredyt na kwotę: "+credit1.cashBorrowed+" zł");
        System.out.println("Oprocentowanie kredytu: "+credit1.interestRate+" %");
    }
}
