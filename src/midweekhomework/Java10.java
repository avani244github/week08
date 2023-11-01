package midweekhomework;

import java.util.Scanner;

/*Write a program to print the sum of
two numbers entered by user by defining your
own method.*/
public class Java10 {
    public static int Sumcalculate(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = scanner.nextInt();
        int sum = Sumcalculate(num1, num2);
        System.out.println("Sum of the two number :" + sum);
    }
}

