package javaprogram;

import java.util.Scanner;

/*Write a java program to get numbers from users
and print whether it is positive or negative.*/
public class JavaQA08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println(number + " is positive number");
        } else if (number < 0) {
            System.out.println(number + " is negative number");
        } else {
            System.out.println("Invalid Input");
        }
    }
}
