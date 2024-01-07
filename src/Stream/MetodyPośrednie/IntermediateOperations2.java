package Stream.MetodyPośrednie;

import Stream.MetodyTerminalne.Course;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperations2 {
    public static void main(String[] args) {

        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(3L, "Tajniki Google", 299, "Marketing"),
                new Course(1L, "Java", 199, "Programowanie")
        );
        //Stream<Course> uniqueStream = courses.distinct();
        //uniqueStream.forEach(System.out::println);

        //Pobranie tylko tych co maja jakas okreslana nazwe
        List<String> javaTitles = courses
                .map(Course::getName)
                .map(name -> name.toLowerCase())
                .filter(name -> name.contains("java"))
                .collect(Collectors.toList());


        Stream<Course> courses2 = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(3L, "Tajniki Google", 299, "Marketing"),
                new Course(1L, "Java", 199, "Programowanie")
        );

        Stream<Course> sorted = courses2.sorted((c1, c2) -> Double.compare(c1.getPrice(), c2.getPrice()));
        sorted.forEach(System.out::println);

    }
}
