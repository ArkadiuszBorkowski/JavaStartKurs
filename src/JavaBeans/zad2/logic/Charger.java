package JavaBeans.zad2.logic;

import JavaBeans.zad2.model.Telephone;

public class Charger {
    public void Charge(Telephone telephone) {
        telephone.setChargeLevel(telephone.getChargeLevel()+ 1);
    }
}
