package DataStructures_practice.Sorting;

import java.util.Arrays;

public class BubbleSorting {


    public static void main(String[] args) {

//        int[] arr = {8,82,9,61,13,12,100,0};
        int[] arr = {1,2,3,4};

        for (int i = 0; i < arr.length;i++) {
            boolean swapped = false;

            for (int j = 1; j < arr.length -i; j++) { //this loop will run only n-i-1 times, or less than n -i times


                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped =  true;

                }
            }

            //this is because if any of the value is not swapped (that means if swap is still false) then stop the loop
            //by this way we say that loop will run only n times in best case

            if (!swapped) { //!false = true
                break;
            }
        }

        System.out.println(Arrays.toString(arr));


    }
}
//6 7 1 3 2 5
//i --> 0 and j --> 1
//check j < j -1 if yes then swap else move the j to j + 1

//for all the passes -->
//checks 7 < 6 no so 6 7 1 3 2 5
//checks 1 < 7 yes so 6 1 7 3 2 5
//checks 3 < 7 yes so 6 1 3 7 2 5
//checks 2 < 7 yes so 6 1 3 2 7 5
//checks 5 < 7 yes so 6 1 3 2 5 7

//for every ith pass the largest value in the array will come to n-1 th position (end position)
// we dont have to compare the last two elements in next i pass since the largest value is already in end
//so jth loop will run only n - i - 1 times

//best case -->  if already sorted-->

// best case --> O(n) times loop will run ---> since inner loop will run only n times -->

//worst case --> unsorted
//worst case--> O(n^2) times --> since i will run n times and j will run n times for every ith time

//imp note-->
// bubble sort is stable algorithm;
// stability means if two values are same but of different index positions comparing with the sorted array then we have
// we have to maintain the order of the array --> stability


