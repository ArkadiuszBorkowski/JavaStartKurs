package Object.ToString;

class School {
    public static void main(String[] args) {
        Student student1 = new Student("Jan Kowalski", 22);
        System.out.println("Lista studentów: ");
        student1.printInfo();
        String info = student1.toString();

        System.out.println(info);
    }
}