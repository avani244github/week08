package javaprogram;

import java.util.Scanner;

/*Write if else condition and print your group name
in console else others group name.
 */
public class JavaQA04 {
    public static void main(String[] args) {
        Scanner groupname = new Scanner(System.in);
        System.out.println("Enter value between 1 to 5 :");
        int groupname1 = groupname.nextInt();
        if (groupname1 == 1) {
            System.out.println("Agile");
        } else if (groupname1 == 2) {
            System.out.println("Selinium");
        } else if (groupname1 == 3) {
            System.out.println("java");
        } else if (groupname1 == 4) {
            System.out.println("postman");
        } else if (groupname1 == 5) {
            System.out.println("code 1");
        } else {
            System.out.println("Invalid input");
        }


    }
}
