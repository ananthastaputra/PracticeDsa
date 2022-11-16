package DataStructures_practice.Recursion;

public class LinearSearch {
    //linear search using loop and recursion method;


    //linear search by for loop method
    public static int searchByloop(int[] arr, int x) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }

        return -1;

    }


    //linear search by recursion
    static int searchByRecursion(int[] arr, int x){
        int temp = 0;

        if (temp < arr.length) { //base case
            if (arr[temp] != x) {
                temp++;
                searchByRecursion(arr, x);
            }
            if (arr[temp] == x) {
                return temp;
            }

        }
            return -1;

    }



    public static void main(String[] args) {

        int[] arr = {16,17,19,29,32};

        int res = searchByloop(arr,32);

//        int ans = searchByRecursion(arr,17);

        if (res == -1) {
            System.out.println("your searching element is not present in the array ");

        } else{
            System.out.println("your element is at " + res + "position");
        }


    }
}






