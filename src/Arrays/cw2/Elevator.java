package Arrays.cw2;

public class Elevator {
    private int maxPerson = 4;
    private double maxWeight = 400;
    private int personCounter = 0;

    private Person[] persons = new Person[maxPerson];

    public void add(Person person) {
        if (personCounter < maxPerson) {
            persons[personCounter] = person;
            personCounter++;
        } else {
            System.out.println("W windzie nie ma już miejsca");
        }
    }

    private boolean weightIsCorrect() {
        return checkTheWeightLimit() <= maxWeight;
    }

    private double checkTheWeightLimit() {
        double totalWeight = 0;
        if (persons[0] != null)
            totalWeight += persons[0].getWeight();
        if (persons[1] != null)
            totalWeight += persons[1].getWeight();
        if (persons[2] != null)
            totalWeight += persons[2].getWeight();
        if (persons[3] != null)
            totalWeight += persons[3].getWeight();
        return totalWeight;
    }

    public void start() {
        if (weightIsCorrect()) {
            System.out.println("Winda ruszyła");
        } else {
            System.out.println("Przekroczono ciężar pasażerów " + (maxWeight - checkTheWeightLimit()) + "kg");
        }
    }

    public void clear() {
        persons[0] = null;
        persons[1] = null;
        persons[2] = null;
        persons[3] = null;
        personCounter = 0;
        System.out.println("Winda jest pusta");
    }
}

