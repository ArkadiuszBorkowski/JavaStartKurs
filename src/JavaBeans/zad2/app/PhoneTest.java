package JavaBeans.zad2.app;

import JavaBeans.zad2.logic.Charger;
import JavaBeans.zad2.model.Telephone;

class PhoneTest {
    public static void main(String[] args) {
        Telephone telephone = new Telephone("Samsung", "Galaxy S10", 3400, 75);
        Charger charger = new Charger();

        System.out.println(telephone);

        charger.Charge(telephone);
        charger.Charge(telephone);
        System.out.println(telephone);

    }

}