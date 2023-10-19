package Object.hashcode;

class School {
    public static void main(String[] args) {
        Student student1 = new Student("Jan Kowalski", 22);
        Student student2 = new Student("Jan Kowalski", 22);
        Student student3 = new Student("Marta Zawadzka", 33);

        boolean studentEquals = student1.equals(student2);
        System.out.println("student1.equals(student2) " + studentEquals);
        int hashCode1 = student1.hashCode();
        int hashCode2 = student2.hashCode();
        int hashCode3 = student3.hashCode();
        System.out.println(hashCode1);
        System.out.println(hashCode2);
        System.out.println(hashCode3);
    }
}