package midweekhomework;

import java.util.Scanner;

/*Modify the above question to allow student to sit
if he/she has medical cause. Ask
user if he/she has medical cause or not ( 'Y' or 'N' )
and print accordingly.*/
public class Java09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of classes held : ");
        int totalClasses = scanner.nextInt();
        System.out.println("Enter the number of class attended : ");
        int attendedClasses = scanner.nextInt();
        double attendancePercentage = ((double) attendedClasses * 100 / totalClasses);
        System.out.println("Percentage : " + attendancePercentage + "% ");
        System.out.println("Do you have a medical cause ? (Y/N) : ");
        char medicalCause = scanner.next().charAt(0);

        if ((attendedClasses >= 75) || (medicalCause == 'Y')) {
            System.out.println("Student is Allowed to attend Exam. ");

        } else
            System.out.println("Student not Allowed to attend Exam. ");


    }

}
