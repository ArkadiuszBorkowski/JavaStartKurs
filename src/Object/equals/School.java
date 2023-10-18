package Object.equals;

class School {
    public static void main(String[] args) {
        Student student1 = new Student("Jan Kowalski", 22);
        Student student2 = new Student("Jan Kowalski", 22);

        System.out.println("student1 == student2");
        System.out.println(student1 == student2);

        System.out.println("student1.equals(student2)");
        boolean studentEquals = student1.equals(student2);
        System.out.println(studentEquals);

    }
}
