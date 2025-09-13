//15.Write a program to print fibonacci series up to n terms using loop//
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int a=0;
        int b=1;
        System.out.print("fibonacci series "+a+" "+b+" ");
        for (int i=2;i<n;i++){
            int c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
