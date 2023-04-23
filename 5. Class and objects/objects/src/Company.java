public class Company {
    public static void main(String[] args) {
        String titleCompany = "Biała Gwiazda";

        Employee player1 = new Employee();
        Employee player2 = new Employee();
        Employee player3 = new Employee();

        player1.name = "Maciej";
        player1.surname = "Żurawski";
        player1.dateOfBirth = "1980";
        player1.seniority = 5;

        player2.name = "Jakub";
        player2.surname = "Błaszczykowski";
        player2.dateOfBirth = "1985";
        player2.seniority = 1;

        player3.name = "Arkadiusz";
        player3.surname = "Głowacki";
        player3.dateOfBirth = "1975";
        player3.seniority = 10;

        System.out.println("Zawodnicy klubu: " + titleCompany);
        System.out.println(player1.name+" "+player1.surname+", rok urodzenia: "+player1.dateOfBirth+
                ", staż w klubie: "+player1.seniority+" lat.");
        System.out.println(player2.name+" "+player2.surname+", rok urodzenia: "+player2.dateOfBirth+
                ", staż w klubie: "+player2.seniority+" lat.");
        System.out.println(player3.name+" "+player3.surname+", rok urodzenia: "+player3.dateOfBirth+
                ", staż w klubie: "+player3.seniority+" lat.");

    }
}
