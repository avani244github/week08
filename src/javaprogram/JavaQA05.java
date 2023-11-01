package javaprogram;

import java.util.Scanner;

/*Write a java program to input student Name, roll No,
and three subjects Math, Science and English
marks (marks is between 0 to 100 and
if it is out of range print error message “InvalidInput, Marks
should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35)
and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format*/
public class JavaQA05 {
    String studentName;
    int rollNumber;
    int mathMarks;
    int scienceMarks;
    int englishMarks;

    public static void main(String[] args) {
        JavaQA05 student = new JavaQA05();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        student.studentName = scanner.nextLine();
        System.out.println("Enter Roll Number: ");
        student.rollNumber = scanner.nextInt();
        student.mathMarks = getValidMarks("Math", scanner);
        student.scienceMarks = getValidMarks("Science", scanner);
        student.englishMarks = getValidMarks("English", scanner);

        int totalMarks = student.mathMarks + student.englishMarks + student.scienceMarks;
        double percentage = (totalMarks / 3.0);
        String grade = calculateGrade(percentage);

        String result = (percentage >= 35) ? "Pass" : "Fail";
        System.out.println("------------------------------------------------------");
        System.out.println("|                     Mark Sheet                     |");
        System.out.println("|                                                    |");
        System.out.println("-----                                                |");
        System.out.println("|     Name         :   " + student.studentName + "                        |");
        System.out.println("|     Roll No      :   " + student.rollNumber + "                             |");
        System.out.println("                                                      ");
        System.out.println("|                                                    |");
        System.out.println("------------------------------------------------------");
        System.out.println("|      Subject     :      Marks                     |");
        System.out.println("|                                                    |");
        System.out.println("------------------------------------------------------");
        System.out.println("|     Math        :    " + student.mathMarks + "                           |");
        System.out.println("|     Science     :    " + student.scienceMarks + "                           |");
        System.out.println("|     English     :    " + student.englishMarks + "                           |");
        System.out.println("|                                                    |");
        System.out.println("------------------------------------------------------");
        System.out.println("      Total       :    " + totalMarks + "                           |");
        System.out.println("|                                                    |");
        System.out.println("------------------------------------------------------");
        System.out.println("|     Percentage  :    " + percentage + "%" + "                        |");
        System.out.println("|     Result      :    " + result + "                          |");
        System.out.println("|     Grade       :    " + grade + "                            |");
        System.out.println("|                                                    |");
        System.out.println("------------------------------------------------------");
    }


    public static String calculateGrade(double percentage) {
        if (percentage >= 80) {
            return "A+";
        } else if (percentage >= 60) {
            return "A";

        } else if (percentage >= 50) {
            return "B";
        } else if (percentage >= 35) {
            return "C";

        } else {
            return "Fail";
        }
    }

    public static int getValidMarks(String subject, Scanner scanner) {
        int marks;
        do {
            System.out.println("Enter marks in " + subject + "(0 to 100): ");
            marks = scanner.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("InvalidInput");
            }
        } while (marks < 0 || marks > 100);
        return marks;
    }

}
