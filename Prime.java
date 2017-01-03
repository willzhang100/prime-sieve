import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        System.out.print("Prints the first N primes. N = ");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] primes = firstNPrimes(N);
        printArray(primes);
    }

    private static void printArray(int[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static int[] firstNPrimes(int n) {
        int[] p = new int[n];
        int num = 2;
        int i = 0;
        while(i < n) {
            if(isPrime(num)) p[i++] = num;
            num++;
        }
        return p;
    }

    private static boolean isPrime(int n) {
        if(n < 2) return false;
        for(int i = 2; i<n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
