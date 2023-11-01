package javaprogram;

import java.util.Scanner;

/*Write a program that tells us input value is number or an alphabet
orsymbol.*/
public class JavaQA15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value :");
        char input = scanner.next().charAt(0);
        if (Character.isDigit(input)) {
            System.out.println("It's Number");
        } else if (Character.isAlphabetic(input)) {
            System.out.println("It's a Alphabet");

        } else {
            System.out.println("It's a symbol");
        }
    }
}
