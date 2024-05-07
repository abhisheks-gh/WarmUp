// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...

import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String[] args) {
        FibonacciNumber obj = new FibonacciNumber();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(obj.computeNthFibonacciNumber(n) );
        sc.close();
    }

    public int computeNthFibonacciNumber(int n) {
        // base condition
        // Fibo(0) = 0, Fibo(1) = 1
        if (n < 2) {
            return n;
        }

        return computeNthFibonacciNumber(n - 1) + computeNthFibonacciNumber(n - 2);
    }

}
