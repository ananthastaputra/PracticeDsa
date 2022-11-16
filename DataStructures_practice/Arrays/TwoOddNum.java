package DataStructures_practice.Arrays;
import java.util.*;

public class TwoOddNum {


    public static void solve(int[] arr, int N) {
        List<Integer> list = new ArrayList();
        HashMap<Integer,Integer> map = new HashMap<>();
        int [] res = new int[2];

        for (int i = 0; i <N; i++) {
            if (!map.containsKey(arr[i])){
                map.put(arr[i],1);

            }
            else{
                map.put(arr[i],map.get(arr[i] + 1));
            }
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if ((entry.getValue()%2) != 0) {
                list.add(entry.getKey());

            }

        }
        Collections.sort(list);
        res[0] = list.get(1);
        res[1] = list.get(0);

        System.out.println(res);


    }

    public static void main(String[] args) {
        int[] arr = {4,2,4,5,2,3,3,1};
        int N = arr.length;
//
//        int k = 0;
//        int count = 1;
//        int[] res = new int[2];
//        HashSet<Integer> set = new HashSet<Integer>();
//
//        for(int i = 0; i < N; i++) {
//            // int temp = arr[i];
//            if (!set.contains(arr[i])){
//                for (int j = i+1; j < N; j++) {
//
//                    if (arr[j] ==  arr[i]) {
//                        count++;
//                    }
//                }
//
//                if (count % 2 != 0) {
//                    res[k] = arr[i];
//                    k = k+1;
//                }
//            }
//
//
//            set.add(arr[i]);
//            count = 1;
//        }
//
////        return res;
////        System.out.println("Array : " + Arrays.toString(res));
////        System.out.println(set);

         solve(arr,N);
//        System.out.println(Arrays.toString(ans));

    }
}
