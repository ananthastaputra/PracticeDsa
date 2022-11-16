package DataStructures_practice.Recursion;

public class PrintFact {

    public static int printFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n*printFactorial(n-1);
    }

    public static void main(String[] args) {

    }
}
