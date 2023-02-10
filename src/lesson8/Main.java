package lesson8;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int length = 10;
        int myArray[] = new int[length];

        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(58);
        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }

        int max = Arrays.stream(myArray).max().getAsInt();
        System.out.println();
        System.out.println("Largest of given array " + max);

        int min = Arrays.stream(myArray).min().getAsInt();
        System.out.println("Smallest of given array " + min);

        int sum = Arrays.stream(myArray).sum();
        System.out.println("Sum of array elements is: "+ sum);

        double average = sum / myArray.length;
        System.out.println("Average is: " + average);
    }
}









