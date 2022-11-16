package DataStructures_practice;

import java.util.Arrays;

public class MergeWoExtraSpace {

    public static void merge(long arr1[], long arr2[], int n, int m) {

        for (int i = 0; i < arr2.length; i++){
            long key = arr2[i];
            for(int j = 0; j < arr1.length; j++){
                if(arr1[j] > arr2[i]){
                    long temp = arr1[j];
                    arr1[j] = arr2[i];
                    arr2[i] = temp;

                }

                if (j > 0) {
                    if (arr2[j - 1] > arr2[j]) {
                        long temp2 = arr2[j - 1];
                        arr2[j - 1] = arr2[j];
                        arr2[j] = temp2;
                    }
                }




            }


        }


    }

    public static void main(String[] args) {

        long[] arr1 = {1,3,5,7};
        long[] arr2 = {0, 2, 6, 8, 9};

        int n = arr1.length;
        int m = arr2.length;

        merge(arr1,arr2,n,m);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


    }
}
