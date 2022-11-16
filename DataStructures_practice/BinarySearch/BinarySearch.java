package DataStructures_practice.BinarySearch;

public class BinarySearch {

    public static int binarySearch(int[] arr,int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end)/2;

            if (key == arr[mid]) {
                return mid;
            }

            if (key > arr[mid]) {
                start = mid + 1;
            }

            if (key < arr[mid]) {
                end = end - 1;
            }
        }
        return -1;
    }

    //using for loop binary search;
    //if key is found then loop will get returned; only key index timed the loop will run;

    public static int binarySearchForloop(int[] arr,int key){
        int start = 0;
        int end = arr.length - 1;

        //key == 30
        for (int i = 0; i < arr.length; i++) {
            int mid = (start + end)/2; // mid = 4
             if (key == arr[mid]) return mid;
             if (key > arr[mid]) start = mid + 1;
             if (key < arr[mid]) end = mid - 1;

        }
        return -1;

    }

    public static int binarySearchRecursive(int[] arr, int key, int start, int end){
        if (start <= end) { //base case
            int mid = (start + end)/2;//60


            if (key == arr[mid]) return mid;
            if (key > arr[mid]) return binarySearchRecursive(arr,key,(mid + 1),end);
            if (key < arr[mid]) return  binarySearchRecursive(arr, key, start,(mid - 1));

        }


        return -1;

    }

    public static void main(String[] args) {
        //find the element in which position it is. using binary search.
        //binary search is mainly used for sorted arrays.



        int[] arr = {10, 20, 30, 50, 60, 80, 110, 130, 140, 170};
        int searchKey = 50;
//        int res = binarySearch(arr,searchKey);
//        int ans = binarySearchForloop(arr,searchKey);
//        System.out.println(ans);


        //recursively find element using binary search;

        int start = 0;
        int end = arr.length - 1;
        int answer = binarySearchRecursive(arr,searchKey, start, end);
        System.out.println(answer);



    }
}
