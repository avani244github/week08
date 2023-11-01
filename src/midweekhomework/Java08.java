package midweekhomework;

import java.util.Scanner;

/*A student will not be allowed to sit in exam
if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.*/
public class Java08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of classes held : ");
        int totalClasses = scanner.nextInt();
        System.out.println("Enter the number of class attended : ");
        int attendedClasses = scanner.nextInt();
        double attendancePercentage = ((double) attendedClasses * 100 / totalClasses);
        System.out.println("Percentage : " + attendancePercentage + "% ");
        if (attendedClasses >= 75) {
            System.out.println("Student is Allowed to attend Exam. ");

        } else
            System.out.println("Student not Allowed to attend Exam. ");

    }
}
