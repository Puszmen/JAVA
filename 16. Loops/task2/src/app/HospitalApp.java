package app;

import data.Patient;
import logic.Hospital;

import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {

        final int exit = 0;
        final int add = 1;
        final int print = 2;
        Scanner input = new Scanner(System.in);
        int option = -1;

        Hospital hospital = new Hospital();

        while (option != exit) {
            System.out.println("Dostępne opcje:");
            System.out.println("0 - wyjście z rejestracji");
            System.out.println("1 - dodanie pacjenta");
            System.out.println("2 - wyświetl dane pacjenta");

            System.out.println("Wybierz opcję:");
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case add:
                    Patient patient = new Patient();
                    System.out.println("Proszę podać imię");
                    patient.setFirstName(input.nextLine());
                    System.out.println("Proszę podać nazwisko");
                    patient.setSecondName(input.nextLine());
                    System.out.println("Proszę podać pesel");
                    patient.setPesel(input.nextLine());
                    hospital.addPatient(patient);
                    break;
                case print:
                    hospital.patientInfo();
                    break;
                case exit:
                    System.out.println("Zamykam rejestrację");
                    break;
                default:
                    System.out.println("Nie znaleziono opcji");
            }
        }
        input.close();
    }
}
