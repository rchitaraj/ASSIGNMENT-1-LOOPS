// 5. Write a program to display the multiplication table of 7 using//
import java.util.Scanner;
public class TableOf7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=7;
        for(int i=1;i<=10;i++){
            int result=i*num;
                System.out.println(i+"*"+num+"="+result);
        }
    }
}
