package javaprogram;

import java.util.Scanner;

/*Write the java program to check if enter number is
“POSITIVE”, “NEGATIVE” or“ZERO”*/
public class JavaQA19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println(number + " is positive number");
        } else if (number < 0) {
            System.out.println(number + " is negative number");
        } else {
            System.out.println("It is Zero");
        }
    }
}

