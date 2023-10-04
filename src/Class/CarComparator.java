package Class;

class CarComparator {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A4";
        audi.doors = 4;
        audi.carColor = "Czarny";
        audi.wheelsColor = "Srebrny";
        audi.tiresColor = "Czarny";

        //czy audi jest samochodem?
        boolean isCar = audi instanceof Car;
        System.out.println(isCar); //true
    }
}