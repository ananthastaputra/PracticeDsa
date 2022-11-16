package DataStructures_practice.Sorting;

import java.util.Arrays;

public class MergeSort {


    public static void merge (
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public static void mergeSort(int[] a, int n) {
        if (n < 2) { //base case
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }



    //another way to write the merge sort divide and conquer methods
    //divide method
    public static void divide(int[] arr, int si, int ei) {

        if (si >= ei) { //base case
            return;
        }

        int mid = si + (ei - si)/2; //same as mid = (si+ei)/2;  but for bigger values this doesn't work properly

        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);


    }

    public static void conquer(int[] arr,int si, int mid, int ei){
        int[] merged = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;


        while(idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x] = arr[idx1];
                x++; idx1++;

            }
            else{
                merged[x++] = arr[idx2++];

            }

        }
        while(idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        while(idx2 <= ei) {
            merged[x++] = arr[idx2++];

        }

        for (int i = 0 ,j = si; i < merged.length; i++,j++) {
            arr[j] =  merged[i];
        }





    }

    public static void main(String[] args) {
        int[] arr = {7,6,3,5,1,9};

//        mergeSort(arr,arr.length);
        divide(arr,0,arr.length -1);

        System.out.println(Arrays.toString(arr));




    }
}
