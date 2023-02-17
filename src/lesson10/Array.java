package lesson10;

import java.util.Random;

public class Array {
    int length;
    int[] array;
    int bound;
    int[] sortFromMaxValue;
    int[] getSortFromMinValue;

    public int[] printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            System.out.println();
        }

        return array;
    }

    public int[] generateRandomArray(int length, int min, int max) {
        int[] array = new int[length];
        int i =0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(min, max + 1);
        }
        System.out.println(array[i] + " ");
        return printArray(array);
    }
}

