package DataStructures_practice.Sorting;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Merging {

    public static void merge(int[] arr,int l, int m, int r){

        int[] merged = new int[r-l + 1];
        int i = l;
        int j = m + 1;
        int k = 0;

        while(i <= m && j <= r) {
            if (arr[i] <= arr[j]){
                merged[k] = arr[i];
                k++;
                i++;
            }
            else{
                merged[k] = arr[j];
                k++;
                j++;
            }
        }


        //for remaining elements--> in left part of array

        while(i <= m) {
            merged[k] = arr[i];
            i++;
            k++;

        }

        //for remaining elements --> in right part of array

        while(j <= r) {
            merged[k] = arr[j];
            k++;
            j++;

        }


        //copy of array from merged array


        for (int p = 0; p < merged.length; p++) {

            arr[l + p] = merged[p];
        }

    }


    public static void mergeSort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }

        int m = l +(r-l)/2;


        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        merge(arr,l,m,r);
    }

    public static void main(String[] args) {
        int[] arr = {4,1,3,9,7};
        int n = arr.length;
        mergeSort(arr,0,n-1);

        System.out.println(Arrays.toString(arr));


    }
}
