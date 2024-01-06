package Stream.MetodyTerminalne;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperation {
    public static void main(String[] args) {

//        metody terminalne, czyli takie, które albo konsumują strumień, albo zwracają wynik, który nie jest
//        strumieniem. Po wykonaniu metody terminalnej nie ma już możliwości wykonania kolejnych operacji
//        na strumieniu, należy go stworzyć od nowa.

        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing")
        );

        //forEach wykorystuje interfejs consumer czyli nie zwraca wyniku, przyjmuje argument T
        //courses.forEach(course -> System.out.println(course));

        // courses.forEach(System.out::println);           //    strumien do wyświetlania wartości
        // long count = courses.count();                   //    zliczanie obiektów w strumieniu

        // aby wyciągnąć (najw) najmniejszy obiekt ze strumienia należy zastosować metodę min lub max

        //Optional<Course> min = courses.min((a1, a2) -> Double.compare(a1.getPrice(), a2.getPrice()));
        //  V V zamiana na referencję do metody
        Optional<Course> cheapestCourse = courses.min(Comparator.comparingDouble(Course::getPrice));
        cheapestCourse.ifPresent(System.out::println);

        //sprawdzanie czy chociaż jeden elementr strumienia ma spełniony warunek
        boolean under100 = courses.anyMatch(course -> course.getPrice() < 100);
        if (under100)
            System.out.println("Conajmnej jedej kurs jest tańszy niż 100 zl");


        //sprawdzanie czy wszystkie elementy strumienia mają spełniony warunek
        boolean above10 = courses.allMatch(course -> course.getPrice() > 10);
        if (above10)
            System.out.println("Wszystkie kursy są droższe niż 10 zl");

        //sprawdzanie czy żaden element strumienia nie spełnia waruneku
        boolean noAbove300 = courses.anyMatch(course -> course.getPrice() > 300);
        if (noAbove300)
            System.out.println("Żodyn kurs nie jest droższy niż 300 zl");

        // elementry strumienia do tablicy, za pomocą metody
        //Course[] coursesArray = courses.toArray(x -> new Course[x]);
        Course[] coursesArray = courses.toArray(Course[]::new);

        // Tablice będą w większości przypadków zastępowane efektywniejszymi zbiorami danych np kolekcje
//        courses.collect(ArrayList<Course>::new,
//                (courses1, course) -> courses1.add(course),
//                ArrayList::addAll
//        );

        courses.collect(ArrayList<Course>::new,
                ArrayList::add,
                ArrayList::addAll
        );

        //inna lepsza wersja -->
        List<Course> collect = courses.collect(Collectors.toList());  //zebrane do listy
        Set<Course> collect1 = courses.collect(Collectors.toSet());   //zebrane do zbioru

        TreeSet<Course> collect2 = courses.collect(Collectors.toCollection(TreeSet::new));  //zebrane do konretnego typu
    }
}
