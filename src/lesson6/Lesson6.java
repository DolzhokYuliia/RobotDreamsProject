package lesson6;
import java.util.Scanner;
public class Lesson6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int a = 1; a <= 100; a++) {
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }
        }
        System.out.println();
        long num1 = 0, num2 = 1, sum = 0;
        System.out.print (num1 + " " + num2);
        for (int j = 2; j <= 100; j++) {
            sum = num1 + num2;
            if (sum <= 100) {
                System.out.print (" " + sum );
                num1 = num2;
                num2 = sum;
            }
        }
        System.out.println();
        int num = 7;
        long factorial = 1;
        for (int f = 1; f <= 7; f++){
          factorial = factorial * f;
        }
        System.out.println(factorial);
    }
}







