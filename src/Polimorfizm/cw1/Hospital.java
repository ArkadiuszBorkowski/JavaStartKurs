package Polimorfizm.cw1;

import java.util.Arrays;

class Hospital {

    private static int MAX_EMPLOYEES = 3;
    private Person[] employees  = new Person[MAX_EMPLOYEES];
    private int employessNumber = 0;

    void add(Person person) {
        if(employessNumber < MAX_EMPLOYEES){
            employees[employessNumber] = person;
            employessNumber++;
        }
    }



    String getInfo() {
        String result  = "";
        for (int i = 0; i < employees.length; i++) {
            result  = result + employees[i].getInfo() + "\n";

        }
        return result;
    }
}
