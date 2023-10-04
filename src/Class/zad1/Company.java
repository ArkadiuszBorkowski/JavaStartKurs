package Class.zad1;

class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        employee1.firstName = "Jan";
        employee1.lastName = "Kowalski";
        employee1.birthYear = 1990;
        employee1.seniority = 4;

        employee2.firstName = "Adam";
        employee2.lastName = "Nowak";
        employee2.birthYear = 1987;
        employee2.seniority = 2;

        employee3.firstName = "Paweł";
        employee3.lastName = "Grzęda";
        employee3.birthYear = 1994;
        employee3.seniority = 1;

        System.out.println("Pan " + employee1.firstName + " " + employee1.lastName + ", ur. " + employee1.birthYear +
                " pracuje łącznie lat ok " + employee1.seniority);

        System.out.println("Pan " + employee2.firstName + " " + employee2.lastName + ", ur. " + employee2.birthYear +
                " pracuje łącznie lat ok " + employee2.seniority);

        System.out.println("Pan " + employee3.firstName + " " + employee3.lastName + ", ur. " + employee3.birthYear +
                " pracuje łącznie lat ok " + employee3.seniority);
    }
}
