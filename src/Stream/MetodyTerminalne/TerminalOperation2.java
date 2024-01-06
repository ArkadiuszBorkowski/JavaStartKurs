package Stream.MetodyTerminalne;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperation2 {
    public static void main(String[] args) {

//        metody terminalne, czyli takie, które albo konsumują strumień, albo zwracają wynik, który nie jest
//        strumieniem. Po wykonaniu metody terminalnej nie ma już możliwości wykonania kolejnych operacji
//        na strumieniu, należy go stworzyć od nowa.

        Stream<Course> courses = Stream.of(
                new Course(1L, "Java", 199, "Programowanie"),
                new Course(2L, "Sztuka pisania", 99, "Rozwój osobisty"),
                new Course(3L, "Tajniki Google", 299, "Marketing")
        );

        //Double sum = courses.map(Course::getPrice).reduce(0.0, (result, next) -> result += next);
        Double sum = courses.map(Course::getPrice).reduce(0.0, Double::sum);
        System.out.println("Suma = " + sum);

        Stream<String> names = Stream.of("Ania", "Basia", "Kasia");
        String allNames = names.reduce("", (result, next) -> result + next + " ");
       //wynik = Ania", "Basia", "Kasia
    }
}
