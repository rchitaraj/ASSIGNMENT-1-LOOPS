//17. Write a program to find the sum of digits of a given number using a loop.//
import java.util.Scanner;
public class CountSumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int count = 0;
        int sum = 0;
        while (num > 0) {
            num = num / 10;
            count++;
            sum += count;
        }
        System.out.println(sum);
    }
}
