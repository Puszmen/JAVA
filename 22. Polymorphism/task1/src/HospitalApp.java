public class HospitalApp {
    public static void main(String[] args) {

        Hospital hospital = new Hospital();

        hospital.add(new Doctor("Jan","Kowalski",10000,5000));
        hospital.add(new Nurse("Karyna","Byk",5000,10));
        hospital.add(new Nurse("Maryna","Koń",5000,15));

        System.out.println("Pracownicy szpitala:");
        String info = hospital.getInfo();
        System.out.println(info);
    }
}
