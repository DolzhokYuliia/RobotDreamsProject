package lesson8;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int length= 20;
        int arr[]= new int [length];

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(58);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print (arr[i] + " ");
        }
    }
}