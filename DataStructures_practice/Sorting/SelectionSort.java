package DataStructures_practice.Sorting;

import java.util.Arrays;

public class SelectionSort {


    public static void main(String[] args) {
        int[] arr = {16,9,18,13,24,0,14,1};
        int minIndex = 0;


        for (int i = 0; i < arr.length; i++) {

//            int temp = arr[minIndex];
            for (int j = i + 1; j < arr.length; j++) { //inner loop to check all the i+1 elements which is greater than arr[i]

                if (arr[minIndex] > arr[j]) {
                    int temp = arr[i];
                    arr[minIndex] = arr[j]; //if the first element is greater than comparing elemennt swap it
                    arr[j] = temp;
//                    temp = arr[i]; //update the temp to newly swapped variable


                }

            }
            minIndex++; // outer loop is for increasing the minIndex only to run loop again with new index
            //pointing towards the next element and comparing with that element
        }
        System.out.print(Arrays.toString(arr));



    }
}
