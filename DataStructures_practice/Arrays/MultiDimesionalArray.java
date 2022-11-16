package DataStructures_practice.Arrays;
import java.util.*;

public class MultiDimesionalArray {

    public static void main(String[] args) {

        //[[1,1] [1,3]];

        Scanner sc = new Scanner(System.in);
        //m == rows
        int m = sc.nextInt();

        //n---> columns
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        //rows
        for (int i = 0; i < m; i++ ) { //outer loop
            for (int j = 0; j < n; j++) { //inner loop
                arr[i][j] = sc.nextInt();
            }


        }

        System.out.print(Arrays.deepToString(arr));

    }
}
