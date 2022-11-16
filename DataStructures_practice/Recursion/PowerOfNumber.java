package DataStructures_practice.Recursion;
import java.math.BigInteger;

public class PowerOfNumber {
    //problem from geek for geeks platform

    static int number = 0;
    static int temp = 0;

    static BigInteger myNum = new BigInteger("1");

    static BigInteger value = new BigInteger("1000000007");
    public static int reverseNumber(int num) { //reverse the number using recursion

            if (num != 0 ){ //edge case

                temp = temp*10 + num%10;
                return reverseNumber(num/10);
            } else {
                return temp;
            }


    }
    public static BigInteger powerOf(int N, int R) {
        if (R != 0) {
            myNum = myNum.multiply(BigInteger.valueOf(N));
            return powerOf(N,R-1);
        } else {
            return myNum;

        }
    }

    public static void main(String[] args) {

         int N = 12;
         int reversedNumber = reverseNumber(N);
        System.out.println(reversedNumber);
        powerOf(12,21);
        System.out.println(myNum.remainder(value));
    }
}
