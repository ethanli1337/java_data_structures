package datastructures;

import java.util.ArrayList;

public class bottom_up {

    public static int counter = 0;
    public static int fib(int n) {
        ArrayList<Integer> fibList = new ArrayList<Integer>();
        fibList.add(0);
        fibList.add(1);

        for (int i = 2; i <= n; i++) {
            counter++;
            fibList.add(fibList.get(i-1) + fibList.get(i-2));

        }

        return fibList.get(n);
    }
}
