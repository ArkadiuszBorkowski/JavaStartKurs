package TypyGeneryczne.przyklad1;

public class PairTest {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("Ania", 1991);
        Pair<Double, Double> p2 = new Pair<>(20.5, 31.7);
        Pair<String, String> p3 = new Pair<>("Jan", "Kowalski");

        System.out.println(p1.getT());
    }

}

