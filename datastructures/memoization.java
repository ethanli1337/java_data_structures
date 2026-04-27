package datastructures;

import java.util.ArrayList;

public class memoization {
    static Integer[] memo = new Integer[100];
    static ArrayList<Integer> dMemo = new ArrayList<>(); 

    public static int fib(int n) {
        if (memo[n] != null) {
            return memo[n];
        }

        if (n == 0 || n == 1) {
            return n;
        }

        memo[n] = fib(n-1) + fib(n-2);

        return memo[n];
    }

    public static int dynamicFib(int n) {
        // Initialize base cases
        if (dMemo.size() == 0) {
            dMemo.add(0);
            dMemo.add(1);
        }

        // If already computed, return cached value
        if (n < dMemo.size()) {
            return dMemo.get(n);
        }

        // Recursively compute and store result
        int result = dynamicFib(n - 1) + dynamicFib(n - 2);
        dMemo.add(result);
        return result;
    }
}
