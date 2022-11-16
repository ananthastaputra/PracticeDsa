package DataStructures_practice;
import java.sql.SQLOutput;
import java.util.*;

public class power {

    public static int powerOf(int x, int n){
        int temp;
        if (n == 0){
            return 1;
        }
        temp = powerOf(x, n/2);

        if (n % 2 == 0){
            return temp*temp;

        }
        else{
            return x*temp*temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter X :");
        int x = sc.nextInt();

        System.out.println("Enter n :");
        int n = sc.nextInt();

        int result = powerOf(x,n);

        System.out.println(result);
    }
}
