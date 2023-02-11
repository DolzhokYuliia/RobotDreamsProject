package lesson8;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int length = 10;
        int[] myArray = getIntArray(length);
        int maxNumber = getMaxNumberOfArray(myArray);
        System.out.println(maxNumber);
    }

    public static int getMaxNumberOfArray(int[] myArray) {
        int max = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        System.out.println(max);
        return max;
    }

    public static int[] getIntArray(int length) {
        Random random = new Random();
        int [] myArray = new int [length];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(58);
            System.out.print(myArray[i] + " ");
        }
        return myArray;
    }
}








