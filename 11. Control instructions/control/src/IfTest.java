class IfTest {
    public static void main(String[] args) {
        User user = new User("Jan", "Kowalski");
        System.out.println("Wybierz opcję:");
        System.out.println("0 - wyjście z programu");
        System.out.println("1 - wyświetlenie informacji o użytkowniku");
        System.out.println("2 - modyfikacja danych");

        int option = 3;

        if (option == 0) {
            System.out.println("Bye bye");
        } else if (option == 1) {
            System.out.println("Dane użytkownika: "+user.firstName+" "+user.surname);
        } else if (option == 2) {
            user.setFirstName("Marian");
            user.setSurname("Kowalczyk");
            System.out.println("Zmienione dane użytkownika: "+user.firstName+" "+user.surname);
        } else {
            System.out.println("Błędna opcja");
        }
    }
}