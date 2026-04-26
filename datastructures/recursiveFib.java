package datastructures;

public class recursiveFib {
    public static int counter = 0;

    public static int fib(int n) {
        counter++;
        if (n == 0 || n == 1) {
            return n;
        }

        return fib(n-1) + fib(n-2);
    }
}
