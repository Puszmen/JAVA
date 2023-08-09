public class School {

    private Student[] students;
    private int studentsNumber;

    public School (int studentsNumber) {
        students = new Student[studentsNumber];
    }

    public void add (Student s) throws NoMoreSpaceException {
        if (studentsNumber >= students.length)
            throw new NoMoreSpaceException("Nie ma miejsca w szkole " + students.length);
        students[studentsNumber] = s;
        studentsNumber++;
    }

    public Student find (String firstName, String lastName) {
        for (int i = 0; i < studentsNumber; i++) {
            if (students[i].getFirstName().equals(firstName) && students[i].getSecondName().equals(lastName)) {
                return students[i];
            }
        }
        throw new NoElementFoundException("Nie znaleziono studenta " + firstName + " " + lastName);
    }

}
