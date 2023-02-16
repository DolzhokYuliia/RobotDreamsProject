package lesson8;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int length = 10;
        int[] myArray = getIntArray(length);
        int maxNumber = getMaxNumberOfArray(myArray);
        int minNumber = getMinNumberOfArray(myArray);
        int sumOfAllNumbers = getSumOfAllArrayElements(myArray);
        int averageOfArray = getAverageOfArray(myArray);
        System.out.println("Max value of the array is: " + maxNumber);
        System.out.println("Min value of the array is: " + minNumber);
        System.out.println("Sum of all array elements is: " + sumOfAllNumbers);
        System.out.println("An average of the array is: " + averageOfArray);
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
    public static int getMinNumberOfArray (int [] myArray){
        int min = myArray[0];
        for (int i =1; i < myArray.length; i ++) {
            if (myArray[i] < min) {
                min = myArray[i];
            }
        }
        return min;
    }
    public static int getSumOfAllArrayElements (int [] myArray){
        int sum = 0;
        for (int i = 0; i < myArray.length; i++){
            sum += myArray[i];
        }
        return sum;
    }
    public static int getAverageOfArray (int [] myArray){
        int aver = 0;
        int sum =0;
        for (int i =0; i < myArray.length; i ++){
            sum += myArray [i];
            aver = sum/ myArray.length;
        }
        return aver;
    }
}








