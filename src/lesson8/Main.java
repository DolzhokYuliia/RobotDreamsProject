package lesson8;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int length = 10;
        int[] myArray = randomArray(length);
    }

    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] myArray = new int[size];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(58);
        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        return myArray;
    }
}






