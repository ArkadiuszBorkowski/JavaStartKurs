package Polimorfizm.lesson;

public class Zoo {
    public static void main(String[] args) {
//        Animal animal = new Animal("Kotopies");
//        Animal cat = new Cat("Mruszek");
//        Animal dog = new Dog("Burek");

//        Animal animal = new Animal("Kotopies");
//        Cat cat = new Cat("Mruszek");
//        Dog dog = new Dog("Burek");

        Animal[] animals = new Animal[3];
        animals[0] = new Animal("Kotopies");
        animals[1] = new Cat("Mruszek");
        animals[2] = new Dog ("Burek");

        for (Animal animal : animals) {
            animal.giveSound();
        }
    }

    private static void changeAnimalName(Animal animal, String newName) {
        animal.setName(newName);
    }
}
