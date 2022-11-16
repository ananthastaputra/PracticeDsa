package DataStructures_practice.Arrays;
import java.util.*;

public class BinaryNumbers {

    public static void main(String[] args) {

        //we have to put all the zeros on left side and all the ones on right side;

        //count no of zeros and count no of ones in first loop and then create another two loops to insert no of zeros
        //zeros and countOne times 1
        int[] arr = {0,1,1,0,1,0,1};
        int countZero = 0;
        int countOne = 0;
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countZero++;
            }
            if (arr[i] == 1) {
                countOne++;
            }


        }
        System.out.println("no of zeros : " + countZero);
        System.out.println("no of ones : " + countOne);

        for (int i = 0; i < countZero; i++) {
            res[i] = 0;
        }
        System.out.println(countZero);
        for (int i = countZero; i < arr.length; i++) {
            res[i] = 1;
        }

        System.out.print(Arrays.toString(res));

    }
}
