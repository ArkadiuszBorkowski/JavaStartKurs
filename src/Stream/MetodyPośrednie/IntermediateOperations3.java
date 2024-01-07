package Stream.MetodyPośrednie;

import Stream.MetodyTerminalne.Course;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperations3 {
    public static void main(String[] args) {

        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(3L, "Tajniki Google", 299, "Marketing"),
                new Course(1L, "Java", 199, "Programowanie")
        );

//        List<String> javaTitles = courses
//                .filter(course -> course.getName().toLowerCase().contains("java"))
//                .peek(course -> System.out.println("Filtered stream: " + course))  // coś ala debuger, consolPrinter
//                .map(Course::getName)
//                .collect(Collectors.toList());
//        System.out.println(javaTitles);

        courses
                .sorted(Comparator.comparingDouble(Course::getPrice))
                .skip(3)//pomija 3 obiekty
                .forEach(System.out::println);

    }
}
