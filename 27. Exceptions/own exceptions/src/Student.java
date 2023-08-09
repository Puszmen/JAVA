public class Student {

    private int studentId;
    private String firstName;
    private String secondName;

    public Student(int studentId, String firstName, String secondName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return studentId + " " + firstName + " " + secondName;
    }
}
