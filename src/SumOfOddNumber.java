// 9. Write a program to find the sum of odd numbers between 1 and 100.//
import java.util.Scanner;
public class SumOfOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("sum of the first 100 odd numbers");
        int sum = 0;
        for (int i = 1; i <= 100;i++) {
            if(i%2==0) {
                continue;
            }
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

