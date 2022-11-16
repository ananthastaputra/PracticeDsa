package DataStructures_practice.Arrays;

public class LeftRotationOfArray {
    //there are 3 more methods by creating a temp array and copying from starting position it will take extra space
    //there is another method to find gcd (juggling algo)
    //another method by reversing the array 3 times by taking starting psoition  but takes recursive




    public static void main(String[] args) {
        //rotate the array left wards k times
        //this doesnt take extra space
        //if we consider array to rotate where k = n means the original array will be returned
        //so we have to find the remainder of k % n to find the starting position of the rotated array
        //after finding the starting psoition of rotated array print elements from that starting position of rotated array



        int[] arr = {1,2,3,4,5}; // ---->[3 4 5 1 2]
        int n = arr.length;
        int k = 2; //rotate k times



        int mod = k % n; //this will tell about the starting position

        for (int i = 0; i < n; i++) {
            System.out.print(arr[(i + mod) % n] + " "); //3 4 5 1 2
        }

    }
}
