package javaFullStack;import java.util.Scanner;

public class NumberPropertiesGenerator{

    public static boolean isArmstrongNumber(int num) {
        int originalNum = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, 3);
            num /= 10;
        }
        return originalNum == sum;
    }

    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;
        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isArmstrongNumber(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else if (isPerfectNumber(num)) {
            System.out.println(num + " is a perfect number.");
        } else if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is neither an Armstrong number, nor a perfect number, nor a palindrome.");
        }
    }
}
