package lesson10;

import java.util.Arrays;
import java.util.Random;

public class ArrayHandler {

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public int [] generateRandomArray(int length, int bound) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt (bound);
        }
        return array;
    }
    public int  getArraySortedToMax (int [] array){
        int max = array[i];
       for (int i = 0; i < array.length; i++) {
           if (array[i]< max){
               array [i]= max;
           }
       }
       return array;
    }
}

