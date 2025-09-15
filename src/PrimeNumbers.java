// Write a program to check whether a given number is prime or not.//
import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int i;
        for (i = 2; i <= 11; i++) {
            if (num % i == 0) {
                break;
            }
        }
        if (i == num) {
            System.out.println(num + " Is prime");
        } else {
            System.out.println(num + " Is not prime");
        }
    }
}
