package midweekhomework;

import java.util.Scanner;

/*Write a program to print a string entered by user.*/
public class Java11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String :");
        String enter = scanner.nextLine();
        System.out.println("Enter : " + enter);
    }
}
