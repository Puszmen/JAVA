public class CourseTest {

    public static void main(String[] args) {

        BootcampOnline bootcampOnline1 = new BootcampOnline();

        bootcampOnline1.setId("Online 123 Bootcamp");
        bootcampOnline1.setPrice(899);
        bootcampOnline1.setTitle("JAVA START");
        bootcampOnline1.setDescription("1 poziom nauki JAVY");
        bootcampOnline1.setVideoLength(1500);
        bootcampOnline1.setTimeToFinish(10000);
        bootcampOnline1.setTeacherNameAndSurname("Jan Kowalski");
        bootcampOnline1.setConsultationHours(1000);

        System.out.println("ID kursu: " + bootcampOnline1.getId());
        System.out.println("Cena kursu: " + bootcampOnline1.getPrice() + " zł");
        System.out.println("Nazwa kursu: " + bootcampOnline1.getTitle());
        System.out.println("Opis kursu: " + bootcampOnline1.getDescription());
        System.out.println("Ilośc minut video w kursie: " + bootcampOnline1.getVideoLength());
        System.out.println("Ilość minut potrzebnych do ukończenia kursu: " + bootcampOnline1.getTimeToFinish());
        System.out.println("Imię i nazwisko nauczyciela: " + bootcampOnline1.getTeacherNameAndSurname());
        System.out.println("Ilośc minut kosultacji z nauczycielem: " + bootcampOnline1.getConsultationHours());

    }
}
