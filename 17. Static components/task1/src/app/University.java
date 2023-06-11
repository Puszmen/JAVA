package app;

import data.Student;

public class University {
    public static void main(String[] args) {

        System.out.println("Liczba studentów przed zapisami: " + Student.getID());
        Student student1 = new Student("Maciej", "Żurawski");
        Student student2 = new Student("Tomasz", "Frankowski");
        System.out.println("Liczba studentów po zapisach: " + Student.getID());
    }
}
