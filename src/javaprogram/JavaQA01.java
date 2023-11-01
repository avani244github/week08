package javaprogram;

/*Write a java program that tells us that Input number is odd or even? HINT: use ternary
        operator (? :)*/

import java.util.Scanner;

public class JavaQA01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(number + " is " + result);
    }
}
