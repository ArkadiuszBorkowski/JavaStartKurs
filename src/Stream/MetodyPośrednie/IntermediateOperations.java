package Stream.MetodyPośrednie;

import Stream.MetodyTerminalne.Course;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {
        //GENERUJEMY LICZBY OD 0 - 10 ( 11 ELEMENTÓW)
        List<Integer> collect = IntStream.rangeClosed(0, 10)
                .boxed() //nie można zrobić kolekcji zanim się nie opakuje typów prostych
                .collect(Collectors.toList());
        System.out.println(collect);

        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(3L, "Tajniki Google", 299, "Marketing"),
                new Course(1L, "Java", 199, "Programowanie")
        );
        Stream<Course> expensiveCourses = courses.filter(course -> course.getPrice() <   200);
        expensiveCourses.forEach(System.out::println);

        Stream<Course> uniqueStream = courses.distinct();
        uniqueStream.forEach(System.out::println);

        // można zapisać tak
        Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(3L, "Tajniki Google", 299, "Marketing"),
                new Course(1L, "Java", 199, "Programowanie")
        )
            .filter(course -> course.getPrice() <   200)
            .forEach(System.out::println);

        Course[] cheapCourse = {
                new Course(1L, "Java", 49, "Programowanie"),
                new Course(2L, "Sztuka pisania", 70, "Rozwój osobisty")
        };

        Course[] expensiveCourse = {
                new Course(3L, "Tajniki Google", 299, "Marketing"),
                new Course(1L, "Java", 199, "Programowanie")
        };

        // łączenie tablic
        Stream.of(cheapCourse, expensiveCourse)
                .flatMap(Arrays::stream)
                .forEach(System.out::println);

        IntStream.iterate(0, n -> n + 1)
                .limit(100)
                .boxed()
                .collect(Collectors.toList());

    }
}
