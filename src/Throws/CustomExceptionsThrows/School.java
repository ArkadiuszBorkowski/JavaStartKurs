package Throws.CustomExceptionsThrows;

class School {
    private Student[] students;
    private int studentsNumber;

    public School(int studentsNumber) {
        students = new Student[studentsNumber];
    }

    public void add(Student s) throws NoMoreSpaceExceptions {
        if (studentsNumber >= students.length)
            throw new NoMoreSpaceExceptions("Brak miejsca w szkole. Liczba miejsc " + students.length);
        students[studentsNumber] = s;
        studentsNumber++;

    }

    public void printStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public Student find(String firstName, String lastName)  throws NoElementFoundExceptions {
        for (int i = 0; i < studentsNumber; i++) {
            if (students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName)) {
                return students[i];
            }
        }
        throw new NoElementFoundExceptions("Nie znaleziono elementu " + firstName + " " + lastName);
    }
}