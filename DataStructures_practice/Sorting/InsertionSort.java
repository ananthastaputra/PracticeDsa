package DataStructures_practice.Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {6 ,5 ,2,3,1};
        int n = arr.length;


//        for (int i = 0; i < arr.length - 1; i++) {
//            int j = i;
//
//            while (j >= 0 &&  arr[j + 1] < arr[j]) {
//                int temp = arr[j];
//                arr[j] = arr[j + 1];
//                arr[j + 1] = temp;
//                j = j - 1;
//            }
//        }

        for(int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp = arr[i];

                if (arr[j] < temp) {
                    arr[i] = arr[j];//swapping
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}

//[1,3,2,5,7,4]
//i--> 3
//j-->3-->i+1;
//j-->3
//j-->4











//[1,2,3,1,2,3,4,4];
//output = [1,2,3];


//temp = arr[i]--> arr[1]--> 2