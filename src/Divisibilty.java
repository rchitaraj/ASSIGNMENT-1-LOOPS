//18. Write a program to print all numbers that are divisible by 3 and 5 between 1 and 100.//
import java.util.Scanner;
public class Divisibilty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);

            }
        }
    }
}