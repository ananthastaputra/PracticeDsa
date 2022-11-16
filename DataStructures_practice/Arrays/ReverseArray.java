package DataStructures_practice.Arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1, 9, 10, 17, 21};
        int len = arr.length;

        int temp = arr[0];

        for (int i = 0; i < len / 2; i++) {
            arr[i] = arr[len - (i + 1)];
            arr[len - (i + 1)] = temp;
            temp = arr[i + 1];


        }

        System.out.println(Arrays.toString(arr));

    }
}
