//19. Write a program to print gcd(greatest common divisor of two numbers.//
import java.util.Scanner;
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num1 = sc.nextInt();
        System.out.println("Enter the number");
        int num2 = sc.nextInt();
        while (num1 != 0 && num1 < num2 && num1 > 0 && num2 > 0) {
            int temp = num2 % num1;
            num2 = num1;
            num1 = temp;
        }
        System.out.println("The gcd is "+ num2);
    }
}



