package midweekhomework;

import java.util.Scanner;

/*Take input of age of 3 people by user and determine oldest and youngest among
them.*/
public class Java07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Age of First person : ");
        int age1 = scanner.nextInt();
        System.out.println("Enter Age of Second person : ");
        int age2 = scanner.nextInt();
        System.out.println("Enter Age of Third person : ");
        int age3 = scanner.nextInt();
        int oldest = Math.max(Math.max(age1, age2), age3);
        int youngest = Math.min(Math.min(age1, age2), age3);
        System.out.println("Oldest Person's Age : " + oldest);
        System.out.println("Youngest Person's Age : " + youngest);

    }
}
