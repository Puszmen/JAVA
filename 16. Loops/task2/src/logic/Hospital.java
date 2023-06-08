package logic;

import data.Patient;

public class Hospital {
    private final int maxPatients = 10;
    private Patient[] patients = new Patient[maxPatients];
    private int patientCount = 0;

    public void addPatient(Patient patient) {
        if (patientCount < maxPatients) {
            patients[patientCount] = patient;
            patientCount++;
        } else {
            System.out.println("Osiągnieto maksymalna liczbę pacjentów, zapraszam do rejestracji jutro");
        }
    }

    public void patientInfo() {
        for (int i = 0; i < patientCount; i++) {
            System.out.println("Imię: "+patients[i].getFirstName()+", Nazwisko: "+patients[i].getSecondName()
                    + ", PESEL: "+patients[i].getPesel());
        }
    }
}
