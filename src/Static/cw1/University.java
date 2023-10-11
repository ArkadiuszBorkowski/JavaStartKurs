package Static.cw1;

public class University {

    public static void main(String[] args) {
        Student student1 = new Student("Jan", "Kowalski", 2213231);
        Student student2 = new Student("Dawid", "Nowak", 3121232);

        System.out.println(Student.getStudentsNumber());

    }
}
