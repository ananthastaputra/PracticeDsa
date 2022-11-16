package DataStructures_practice.Matrix;

public class AreMatricesIdentical {


    public static void main(String[] args) {
        int[][] Grid1 = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        int[][] Grid2 = {{1,2,4,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        int N = 4;

        int res = 1;
        for (int i = 0; i < Grid1.length; i++) {
            for (int j = 0; j < N; j++) {
                if (Grid1[i][j] != Grid2[i][j]) {
                    res = 0;
                    break;
                }
                else {
                    res = 1;
                }

            }

            if (res == 0) {
                break;
            }
        }
        System.out.println(res);
    }
}
