package DataStructures_practice.Recursion;

public class basicRecursion {
    //recursion is basically calling the function again and again in the same function or in different function also

    //1 2 3 4 5 6 --> for loop or recursive method;

    //print in reverse ---> 6 5 4 3 2 1



    public static void printN(int N) {

        if (N == 0) { //base case or edge case
            return;
        }

        printN(N-1); //recursive call
        System.out.print(N);
    }
     //print in reverse
    //654321

    public static void printReverse(int N) {

        if (N == 0){ //base case
            return;
        }

        System.out.print(N); //654321
        printReverse(N-1); //calling function


    }


    public static void main(String[] args) {
        printReverse(6);

    }
}
