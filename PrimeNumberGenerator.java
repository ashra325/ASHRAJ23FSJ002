package javaFullStack;
import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGenerator {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        int i = 5;
        while (i * i <= n) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;
    }

    public static List<Integer> generatePrimeList(int start, int end) {
        List<Integer> primeList = new ArrayList<>();
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                primeList.add(num);
            }
        }
        return primeList;
    }

    public static void main(String[] args) {
        List<Integer> primeList = generatePrimeList(1, 100);
        System.out.println(primeList);
    }
}
