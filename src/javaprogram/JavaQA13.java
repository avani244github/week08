package javaprogram;

import java.util.Scanner;

/*Write a java program to input any two number and ask user to enter
their symbol (+, -, /, *) find addition, Subtraction, multiplication
and division according to theirsymbol(using if else)*/
public class JavaQA13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number :");
        int num1 = scanner.nextInt();
        System.out.println("Enter the Second Number :");

        int num2 = scanner.nextInt();
        System.out.println("Enter mathematical operator(+,-,*,/) :");
        char operator = scanner.next().charAt(0);
        double result = 0;
        if (operator == '+') {
            System.out.println(result = num1 + num2);
        } else if (operator == '-') {
            System.out.println(result = num1 - num2);
        } else if (operator == '*') {
            System.out.println(result = num1 * num2);
        } else if (operator == '/') {
            System.out.println(result = num1 / num2);
        } else {
            System.out.println("Invalid input");


        }
    }
}
