package DataStructures_practice;
import java.util.*;

public class largestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array :");
        int n = sc.nextInt();

        System.out.println("enter the numbers of array :");

        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

    }
}
