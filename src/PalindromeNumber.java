//13. Write a program to check whether a given number is palindrome or not//
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int original=num;
        int reverse = 0;
        while (num > 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }
        if (reverse == original) {
            System.out.println("the number is palindrome");
        } else {
            System.out.println("the number is not palindrome");
        }
    }
}

