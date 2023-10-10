package ForForEach;

public class ForLoop {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        // pętla for
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            System.out.println(numbers[i]);
        }

        System.out.println('\n');

        //for each
        int [] numbers2  = {1, 2, 3, 4, 5};
        for (int i : numbers2) {
            System.out.println(i);
        }
    }
}
