package DataStructures_practice.Sorting;

import java.util.Arrays;

public class NewMergeSort {

    //here we create two arrays left and right array this is not in place algo


    public static void merge(int[] leftArray, int[] rightArray, int[] arr) {
        int leftLength = leftArray.length;
        int rightLength = rightArray.length;

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftLength && j < rightLength) {
            if (leftArray[i] < rightArray[j]) {
                arr[k] = leftArray[i];
                i = i + 1;
                k = k + 1;

            } else{
                arr[k] = rightArray[j];
                j = j + 1;
                k = k+1;

            }
        }

        while (i < leftLength) {
            arr[k] = leftArray[i];
            i = i + 1;
            k = k+ 1;
        }

        while(j < rightLength) {
            arr[k] = rightArray[j];
            j = j + 1;
            k = k +1;
        }
//        System.out.println(Arrays.toString(leftArray));

    }

    public static void mergeSort(int[] arr , int n) {

        int mid = n/2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[n - mid];

        if (n < 2) { //base case
            return;
        }

        for (int i = 0; i < mid; i++) {
            leftArray[i] = arr[i];
        }

            for (int i = mid; i < n; i++) {
            rightArray[i - mid] = arr[i];
        }

        mergeSort(leftArray,mid);
        mergeSort(rightArray,mid);
        merge(leftArray,rightArray,arr);

    }

    public static void main(String[] args) {
        int[] arr = {6,8,1,4,5};
        int n  =  arr.length;

        mergeSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
}
