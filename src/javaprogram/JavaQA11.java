package javaprogram;

import java.util.Scanner;

/*Input any alphabet from “A" to “F” and
print their city name accordingly (use if else) ifany
other alphabet should be invalid entry.*/
public class JavaQA11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an alphabet :");
        char alphabet = scanner.next().charAt(0);
        if (alphabet == 'A') {
            System.out.println("Ahmedabad");
        } else if (alphabet == 'B') {
            System.out.println("Bombay");
        } else if (alphabet == 'C') {
            System.out.println("Coimbtore");
        } else if (alphabet == 'D') {
            System.out.println("Dahod");
        } else if (alphabet == 'E') {
            System.out.println("Ecuador");
        } else if (alphabet == 'F') {
            System.out.println("Faridabad");
        } else {
            System.out.println("Invalid Entry ");
        }

    }
}
