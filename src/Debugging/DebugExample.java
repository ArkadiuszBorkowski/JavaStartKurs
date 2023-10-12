package Debugging;

import java.util.Arrays;
import java.util.Scanner;

public class DebugExample {
        public static void main(String[] args) {
            int[] array = createEvenArray(5);
            int[] reversed = reverseArray(array);
            System.out.println(Arrays.toString(reversed));
        }

        /**
         * @param size - number of elements to read
         * @return array containing even numbers
         */
        private static int[] createEvenArray(int size) {
            Scanner scanner = new Scanner(System.in);
            int[] result = new int[size];
            for (int i = 0; i < result.length; i++) {
                System.out.println("Podaj kolejną liczbę:");
                int next = scanner.nextInt();
                if(isEven(next)) {
                    result[i] = next;
                } else {
                    i--;
                }
            }
            return result;
        }



        /**
         *
         * @param number - number to be checked
         * @return true if number is even, or false otherwise
         */
        private static boolean isEven(int number) {
            return number % 2 == 0;
        }

        /**
         * @param array - array to be reversed
         * @return - reversed array
         */
        private static int[] reverseArray(int[] array) {
            int[] reversed = new int[array.length];
            for (int i = 0; i < reversed.length; i++) {
                reversed[i] = array[array.length - 1 - i];
            }
            return reversed;
        }
    }