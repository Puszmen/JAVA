import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperators {
    public static void main(String[] args) {

        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki google", 299, "Marketing")
        );

        Double sumPrice = courses.map(Course::getPrice).reduce(0.0, Double::sum);
        System.out.println("Wszystkie kursy kosztują: " + sumPrice);

        Stream<String> names = Stream.of("Ania", "Kasia", "Basia");
        String allNames = names.reduce("", (result, next) -> result + next + " ");
        System.out.println(allNames);


//        List<Course> listCourses = courses.collect(Collectors.toList());
//        System.out.println(listCourses);
//        TreeSet<Course> treeCourses = courses.collect(Collectors.toCollection(TreeSet::new));

//        Course[] coursesArray = courses.toArray(Course[]::new);
//        System.out.println(Arrays.toString(coursesArray));

//        boolean under100 = courses.anyMatch(course -> course.getPrice() < 100);
//        if (under100)
//            System.out.println("Co najmniej jeden z kursów jest warty mniej niż 100 zł");

//        boolean above10 = courses.allMatch(course -> course.getPrice() > 10);
//        if (above10)
//            System.out.println("Wszystkie kursy są droższe od 10 zł");

//        boolean under300 = courses.noneMatch(course -> course.getPrice() > 300);
//        if (under300)
//            System.out.println("Żaden z kursów nie jest droższy od 300 zł");

    }
}
