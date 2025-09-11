//1. Write a program to print numbers from 1 to 10 using a loop.//
import java.util.Scanner;
public class Num1To10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Printing number from 1 to 10");
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }
}
