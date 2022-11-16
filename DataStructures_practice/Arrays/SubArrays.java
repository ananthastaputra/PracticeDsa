package DataStructures_practice.Arrays;

public class SubArrays {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        for (int i = 0; i < arr.length; i++) {
                for (int k = 0; k <= i; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();

//            System.out.println();
        }
    }
}
