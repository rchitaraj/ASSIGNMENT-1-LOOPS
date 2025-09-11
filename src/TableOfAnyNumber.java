//6. Write a program to display the multiplication table of any number entered by the//
import java.util.Scanner;
public class TableOfAnyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want table of");
        int num=sc.nextInt();
        System.out.println("Enter the number till you want to print the table");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int result=i*num;
            System.out.println(i+"*"+num+"="+result);
        }
    }
}


