package DataStructures_practice.Recursion;

public class PrintNumbers {
    //to print numbers upto n using recursion in order of n to 1 we use printReverse method;
    //to print numbers upto n using recursion in order of 1 to n we use printStraight method

    public static void printReverse(int num) {
        if (num < 0) { //edge case or base case where recursion should stop
            return;
        }
        System.out.println(num);
        printReverse(num -1);

    }

    public static void printStraight(int num) {
        if (num < 0) { //edge case
            return;
        }
        printStraight(num - 1);
        System.out.println(num);

    }

    public static void main(String[] args) {
        printReverse(10);
//        printStraight(4);

    }
}
