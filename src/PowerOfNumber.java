//11. Write a program to calculate the power (x^y) of a number using a loop.//
import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x");
        int x = sc.nextInt();
        int power = 1;
        System.out.println("Enter y");
        int y = sc.nextInt();
        for (int i = 1; i <= y; i++) {
            power = power * x;
        }
        System.out.println(power);
    }
}

