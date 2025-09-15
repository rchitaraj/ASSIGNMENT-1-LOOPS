//14. Write a program to print wheather a number is armstrong number using loops.//
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        int sum = 0;
        int a=num;
        while (a > 0) {
            a = a / 10;
            count++;
        }
        while (temp > 0) {
            int x = temp % 10;
            int pow = 1;
            int y=count;
            while (y > 0) {
                pow = pow * x;
                y--;
            }
            sum = sum + pow;
            temp=temp/10;
        }
        if (sum == num) {
            System.out.println(sum +" armstrong");
        } else {
            System.out.println(sum + " is not armstrong");
        }
    }
}
