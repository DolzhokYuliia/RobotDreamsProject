package com.ua.robot.yuliia.lesson7;

public class Main {
    public static void main(String[] args) {
        double number1 = 34;
        double number2 = 14;
        getCube(number1);
        System.out.println(getCube(number1));
        int myNumber2 = (int)  number2;
        printMaxStars(myNumber2);

    }

    static double getCube(double cube) {
        return Math.pow(cube, 3);
    }

    static void printMaxStars (int number){
        for(int i = 0; i <= number; i++)
            {
                System.out.print("*");
            }
        System.out.println();
        }
    }


