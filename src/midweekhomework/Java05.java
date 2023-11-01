package midweekhomework;

import java.util.Scanner;

/*Take two int values from user and print greatest among them.*/
public class Java05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the Second number : ");
        int num2 = scanner.nextInt();
        int gretestNumber = Math.max(num1, num2);
        System.out.println("The gretestNumber is : " + gretestNumber);
    }

}
