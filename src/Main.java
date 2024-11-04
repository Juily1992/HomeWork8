// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your cA\\

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Задание 1 и 2");
        int[] threeNumbers = new int[]{1, 2, 3};
        double[] threeDoubleNumbers = new double[]{1.57, 7.654, 9.986};
        String[] threeWords = new String[]{"огонь", "вода", "воздух"};
        for (int i = 0; i < threeNumbers.length; i++) {
            if (i == threeNumbers.length - 1) {
                System.out.print(threeNumbers[i]);
            } else {
                System.out.print(threeNumbers[i] + ", ");
            }
        }
        System.out.println("  ");
        for (int i = 0; i < threeDoubleNumbers.length; i++) {
            if (i == threeDoubleNumbers.length - 1) {
                System.out.print(threeDoubleNumbers[i]);
            } else {
                System.out.print(threeDoubleNumbers[i] + ", ");
            }
        }
        System.out.println("  ");
        for (int i = 0; i < threeWords.length; i++) {
            if (i == threeWords.length - 1) {
                System.out.print(threeWords[i]);
            } else {
                System.out.print(threeWords[i] + ", ");
            }
        }

        // Task 3
        System.out.println("  ");
        System.out.println("Задание 3");
        int[] myArray = new int[]{1, 2, 3};
        double[] myArray1 = new double[]{1.57, 7.654, 9.986};
        String[] myArray2 = new String[]{"огонь", "вода", "воздух"};
        for (int i = myArray.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(myArray[i] + ", ");
            } else {
                System.out.print(myArray[i] + " ");
            }
        }
        System.out.println("  ");
        for (int i = myArray1.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(myArray1[i] + ", ");
            } else {
                System.out.print(myArray1[i] + " ");
            }
        }
        System.out.println("  ");
        for (int i = myArray2.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(myArray2[i] + ", ");
            } else {
                System.out.print(myArray2[i] + " ");
            }
        }
        System.out.println("  ");

        // Task 4
        System.out.println("  ");
        System.out.println("Задание 4");
        int[] evenNumbers = new int[]{1, 2, 3};
        System.out.print(Arrays.toString(evenNumbers));
        System.out.println("  ");
        for (int i = 0; i < evenNumbers.length; i++) {
            if (evenNumbers[i] % 2 != 0) {
                evenNumbers[i] += 1;
            }
        }
        System.out.print(Arrays.toString(evenNumbers));
    }
}
