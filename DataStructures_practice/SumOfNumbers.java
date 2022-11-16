package DataStructures_practice;
import java.util.*;

public class SumOfNumbers {




//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int num=sc.nextInt();
//        int sum=0;
//        num=Math.abs(num);
//        while(num>0) {
//            int digit=num%10;
//            sum+=digit;
//            num/=10;
//        }
//        System.out.println("Sum of digits:"+sum);
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int num = sc.nextInt();

        if (num < 0) {
            num = Math.abs(num);

        }
    }


}
