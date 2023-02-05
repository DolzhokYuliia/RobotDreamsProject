package practiceLesson8;

public class Main {
    public static void main(String[] args) {
        int length = 20;
        int[] arr = new int[length];
  //      System.out.println(arr[0]);
        //for (int i = 1; i < 10; i++) {
        //       arr[i] = i;
        //   }
        //  for (int i = 1; i < 10; i++) {
        //      System.out.println(arr[i]);
        //  }
        // }
//}
        for (int i = 1; i < length; i++) {
            arr[i] = i;
        }
        for (int i = 1; i < length; i++) {
            System.out.print (arr[i]+" ");
        }
    }
}