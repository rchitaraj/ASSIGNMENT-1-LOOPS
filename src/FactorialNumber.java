// 10. Write a program to calculate the factorial of a given number using a loop.//
import java.util.Scanner;
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want factorial of");
        int num = sc.nextInt();
        System.out.println("Enter the number you want to print factorial of");
        int factorial=1;
        for (int i=1;i<=num;i++) {
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }
}

