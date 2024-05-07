import java.util.Scanner;

public class PrimeOrNot {

    public static void main(String[] args) {
        PrimeOrNot check = new PrimeOrNot();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(check.isPrime(num));
        sc.close();
    }

    public boolean isPrime(int num) {
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        return isPrime;
    }

}
