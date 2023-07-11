import java.util.Objects;

public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    //    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//         if (obj == null)
//            return false;
//         if (this.getClass() != obj.getClass())
//             return false;
//         Student other = (Student) obj;
//         if (age != other.age)
//             return false;
//         if (name == null) {
//             if (other.name == null)
//                 return false;
//         } else if (!name.equals(other.name)) {
//             return false;
//         }
//        return true;
//    }

}
