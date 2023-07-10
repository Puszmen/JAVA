public class School {
    public static void main(String[] args) {

        Student student1 = new Student("Jan Kowalski", 25);
        Student student2 = new Student("Jan Kowalski", 25);

        System.out.println("student1 == student2");
        System.out.println(student1 == student2);
        System.out.println("student1.equals(student2)");
        boolean equalsStudent = student1.equals(student2);
        System.out.println(equalsStudent);
    }
}
