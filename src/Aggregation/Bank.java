package Aggregation;

class Bank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.firstName = "Jan";
        account1.lastName = "Kowalski";
        account1.pesel = "99234567891";
        account1.balance = 10_000;

        Credit credit1 = new Credit();
        credit1.firstName = "Jan";
        credit1.lastName = "Kowalski";
        credit1.pesel = "99234567891";
        credit1.cashBorrowed = 2000;
        credit1.interestRate = 0.05;
        credit1.termMonths = 12;

        System.out.println("Osoba:");
        //System.out.println(person.firstName + " " + person.lastName + " " + person.pesel);
        System.out.println("posiada konto bankowe z kwotą: " + account1.balance);
        System.out.println("oraz kredyt na kwotę: " + credit1.cashBorrowed);
    }
}
