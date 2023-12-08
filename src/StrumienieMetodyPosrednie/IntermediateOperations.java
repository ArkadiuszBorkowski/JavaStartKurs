package StrumienieMetodyPosrednie;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {
//        Collection<Integer> collect = IntStream.range(0, 9)
//                .boxed()
//                .collect(Collectors.toList());
//
//        System.out.println(collect);

//        Stream.of(
//                new Course(1L, "Java", 249, "Programowanie"),
//                new Course(2L, "Sztuka Pisania", 149, "Programowanie podstawy"),
//                new Course(3L, "Zarządzanie procesami", 369, "Programowanie analityczne"),
//                new Course(4L, "BHP", 99, "BHP od zera"),
//                new Course(5L, "SQL", 201, "Tajniki SQL")
//        )
//        .filter(course -> course.getPrice() > 200)
//        .forEach(System.out::println);

//        Course[] cheapCourses = {
//            new Course(4L, "BHP", 99, "BHP od zera"),
//            new Course(2L, "Sztuka Pisania", 149, "Programowanie podstawy")
//        };
//
//        Course[] expensiveCourses = {
//                new Course(1L, "Java", 249, "Programowanie"),
//                new Course(3L, "Zarządzanie procesami", 369, "Programowanie analityczne"),
//        };
//
////        Stream<Course[]> allCourses = Stream.of(cheapCourses, expensiveCourses);
////        Stream<Course> courseStream = allCourses.flatMap(Arrays::stream);
//
//        Stream.of(cheapCourses, expensiveCourses)
//                .flatMap(Arrays::stream)
//                .forEach(System.out::println);
//        //allCourses.forEach(System.out::println);
//
//        List<Integer> collect = IntStream.iterate(0, n -> n + 1)
//                .limit(100)
//                .boxed()
//                .collect(Collectors.toList());
//
//        System.out.println(collect);

        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 249, "Programowanie"),
                new Course(2L, "Sztuka Pisania", 149, "Programowanie podstawy"),
                new Course(3L, "Java od podstaw", 369, "Programowanie analityczne"),
                new Course(4L, "BHP", 99, "BHP od zera"),
                new Course(6L, "SQL", 201, "Tajniki SQL")
        );

        //Stream<Course> uniqueStream = courses.distinct();
        //uniqueStream.forEach(System.out::println);
//
//        List<String> javaTitles = courses
//                .map(Course::getName)
//                .map(name -> name.toLowerCase())
//                .filter(name -> name.contains("java"))
//                //.filter(name -> name.toLowerCase().contains("java"))
//                .collect(Collectors.toList());

        //System.out.println(javaTitles);

        Stream<Course> sortedCourses = courses.sorted(Comparator.comparingDouble(Course::getPrice));
        sortedCourses.forEach(System.out::println);
    }
}
