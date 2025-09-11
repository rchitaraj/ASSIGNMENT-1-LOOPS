//7. Write a program to find the sum of the first 10 natural numbers.//
import java.util.Scanner;
public class First10NaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("sum of the first 10 natural numbers");
        int sum=0;
        for(int i=1;i<=10;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
