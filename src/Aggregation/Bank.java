package Aggregation;

class Bank {
    public static void main(String[] args) {
        Person person = new Person();
        person.firstName = "Jan";
        person.lastName = "Kowalski";
        person.pesel = "90897812362";

        Address address1 = new Address();
        address1.city = "Warszawa";
        address1.streetNumber = "4";
        address1.flatNumber = "13";
        address1.postalCode = "05-500";
        address1.street = "Wiejska";

        person.livingAddress = address1;
        person.registeredAddress = address1;

        BankAccount account1 = new BankAccount();
        account1.owner = person;
        account1.balance = 10_000;

        Person person2 = new Person();
        person2.firstName = "Janina";
        person2.lastName = "Kowalska";
        person2.pesel = "90329342421";
        person2.livingAddress = address1;
        person2.registeredAddress = new Address();
        person2.registeredAddress.street = "Kołobrzeska";
        person2.registeredAddress.postalCode = "21-212";
        person2.registeredAddress.city = "Pruszków";
        person2.registeredAddress.streetNumber = "5";
        person2.registeredAddress.flatNumber = null;

        BankAccount account2 = new BankAccount();
        account2.owner = person2;
        account2.balance = 5_000;

        Credit credit1 = new Credit();
        credit1.borrower = person;
        credit1.cashBorrowed = 2000;
        credit1.interestRate = 0.05;
        credit1.termMonths = 12;

        System.out.println("Osoba 1:");
        System.out.println(person.firstName + " " + person.lastName);
        System.out.println("mieszka w miejscowości: " + person.livingAddress.city);
        System.out.println("posiada konto bankowe z kwotą: " + account1.balance);
        System.out.println("oraz kredyt na kwotę: " + credit1.cashBorrowed);

        System.out.println("Osoba 2:");
        System.out.println(person2.firstName + " " + person2.lastName);
        System.out.println("mieszka w miejscowości: " + person2.livingAddress.city);
        System.out.println("posiada konto bankowe z kwotą: " + account2.balance);
    }
}
