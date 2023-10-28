package Throws.CustomExceptionsThrows;

class SchoolTest {
    public static void main(String[] args) {
        School school = new School(2);
        try {
            school.add(new Student(1, "Jan", "Kowalski"));
            school.add(new Student(2, "Paweł", "Konopka"));
            school.add(new Student(3, "Jan", "Nawacki"));
        } catch (NoMoreSpaceExceptions e) {
            System.out.println(e.getMessage());
        }

        school.printStudents();

        try {
            Student student = school.find("Jan", "Nowak");
            System.out.println("Znaleziony student o id " +student.getStudentId());
        } catch (NoElementFoundExceptions e) {
            System.out.println("Nie znaleziono studenta");
        }



    }
}

/*
Java jest jedynym językiem programowania,
w którym wprowadzono podział na wyjątki kontrolowane i niekontrolowane. Aktualnie praktycznie wszystkie wyjątki,
które definiuje się w aplikacjach to wyjątki niekontrolowane (dziedziczące po RuntimeException), często wyjątki
kontrolowane uważane są za błąd przy projektowaniu języka Java i raczej staraj się ich unikać w swoich aplikacjach.*/

// wszystkie wyjątki dziedziczące po klasie RuntimeException nie muszą być obsługiwane, natomiast jeśli stworzymy
// klasę dziedziczącą po Exception, to wyjątek taki będzie musiał być obsłużony