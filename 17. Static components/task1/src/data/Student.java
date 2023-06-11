package data;

public class Student {
    private String firstName;
    private String secondName;
    private static int ID = 0;

    public Student(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        ID++;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Student.ID = ID;
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
}
