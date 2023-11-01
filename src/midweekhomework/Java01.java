package midweekhomework;

import java.util.Scanner;

/*Take 10 integers from keyboard using loop and print their average value on the
screen.*/
public class Java01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 10;
        int sum = 0;
        for (int i = 0; i < num; i++) {
            System.out.println("Enter number - " + (i + 1) + ":");
            int number = scanner.nextInt();
            sum += number;
        }
        double average = (double) sum / num;
        System.out.println("Average value : " + average);

    }
}
