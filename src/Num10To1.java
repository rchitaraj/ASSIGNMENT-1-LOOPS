// 2. Write a program to print numbers from 10 to 1 using a loop.//
import java.util.Scanner;
public class Num10To1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Printing number from 1 to 10");
        int i =10;
        while (i>=1) {
            System.out.println(i);
            i--;
        }
    }
}