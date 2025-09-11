// 4. Write a program to print all odd numbers from 1 to 50.//
import java.util.Scanner;
public class OddNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("print all odd numbers from 1 to 50");
        int i=1;
        while(i<=50){
            if(i%2!=0)
                System.out.println(i);
            i++;
        }
    }
}
