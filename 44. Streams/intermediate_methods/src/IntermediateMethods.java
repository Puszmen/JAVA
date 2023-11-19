import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;

public class IntermediateMethods {
    public static void main(String[] args) {

        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 249, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing"),
                new Course(4L, "Java od podstaw", 159, "Programowanie")
        );

        courses
                .sorted(Comparator.comparingDouble(Course::getPrice))
                .skip(3)
                .forEach(System.out::println);

//        List<String> javaCourses = courses
//                .filter(name -> name.getName().toLowerCase().contains("java"))
//                .peek(course -> System.out.println("Filteres stream: " + course))
//                .map(Course::getName)
//                .collect(Collectors.toList());
//        System.out.println(javaCourses);

//        Stream<Course> sortedCourses = courses.sorted(Comparator.comparingDouble(Course::getPrice));
//        sortedCourses.forEach(System.out::println);

//        List<String> javaTitles = courses
//                .map(Course::getName)
//                .filter(name -> name.toLowerCase().contains("java"))
//                .collect(Collectors.toList());
//        System.out.println(javaTitles);

//        Stream<Course> specificCourses = courses.distinct();
//        specificCourses.forEach(System.out::println);

    }
}
//        List<Integer> collect = IntStream.rangeClosed(0, 10)
//                .boxed()
//                .collect(Collectors.toList());
//        System.out.println(collect);

//        Stream.of(
//                new Course(1L, "Java", 249, "Programowanie"),
//                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
//                new Course(1L, "Java", 199, "Programowanie"),
//                new Course(3L, "Tajniki Google", 299, "Marketing"),
//                new Course(1L, "Java", 199, "Programowanie")
//        )
//        .filter(course -> course.getPrice() > 200)
//        .forEach(System.out::println);

//        List<Integer> collect = IntStream.iterate(0, x -> x + 1)
//                .limit(100)
//                .boxed()
//                .collect(Collectors.toList());
//        System.out.println(collect);


//        Course[] cheapCourses = {
//                new Course(1L, "Java", 49, "Programowanie"),
//                new Course(2L, "Sztuka pisania", 79, "Rozwój osobisty")
//        };
//
//        Course[] expensiveCourses = {
//                new Course(1L, "Java", 299, "Programowanie"),
//                new Course(3L, "Tajniki Google", 169, "Marketing")
//        };
//
//        Stream.of(cheapCourses, expensiveCourses)
//                .flatMap(Arrays::stream)
//                .forEach(System.out::println);