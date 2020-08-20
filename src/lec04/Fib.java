package lec04;

public class Fib {

    static long fibExponential(int n) {
        if (n < 3) {
            return 1;
        }
        return fibExponential(n-2) + fibExponential(n-1);
    }

    static long fibFromBase(int n) {
        if (n < 3) {
            return 1;
        }
        long[] fib_vals = new long[n];
        fib_vals[0] = 1;
        fib_vals[1] = 1;
        for (int i=2; i<n; i++) {
            fib_vals[i] = fib_vals[i-2] + fib_vals[i-1];
        }
        return fib_vals[n-1];
    }

    static long fibIterative(int n) {
        if (n < 3) {
            return 1;
        }
        long last = 1;
        long second_to_last = 1;

        for (int i=3; i<=n; i++) {
            long next = last + second_to_last;
            second_to_last = last;
            last = next;
        }
        return last;
    }

    static long fibTailRecursive(int n, long last, long second_to_last) {
        if (n < 3) {
            return last;
        }
        return fibTailRecursive(n-1, last+second_to_last, last);
    }

    public static void main(String[] args) {
        System.out.println(fibFromBase(50));
        System.out.println(fibIterative(50));
        System.out.println(fibTailRecursive(50, 1, 1));
        System.out.println(fibExponential(50));
    }
}
