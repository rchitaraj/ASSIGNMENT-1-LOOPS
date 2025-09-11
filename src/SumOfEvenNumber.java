//8. Write a program to find the sum of even numbers between 1 and 100.//
//import java.util.Scanner;
//public class SumOfEvenNumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("sum of the first 10 natural numbers");
//        int sum = 0;
//        for (int i = 1; i <= 100; i = i + 2) {
//            sum = sum + i;
//        }
//        System.out.println(sum);
//    }
//}

import java.util.Scanner;
public class SumOfEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("sum of the first 10 natural numbers");
        int sum = 0;
        for (int i = 1; i <= 100;i++) {
            if(i%2!=0) {
                continue;
            }
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

