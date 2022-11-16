package DataStructures_practice.Arrays;

import java.util.Arrays;

public class PrintLargestLeft {


    public static void main(String[] args) {
        int[] arr = {2,9,6,8,9};
        int[] res = new int[arr.length];

        int temp = -1;
        int largest = -1;

        for (int i = 0; i < arr.length; i++) {
            res[i] = largest;
            largest = Math.max(largest,arr[i]);

        }

        System.out.print(Arrays.toString(res));



    }
}
