package javaprogram;

import java.util.Scanner;

/*Write a java program to input any number and
 find out if it’s odd or even.*/
public class JavaQA07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }
}
