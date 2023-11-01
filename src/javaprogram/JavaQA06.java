package javaprogram;

import java.util.Scanner;

/*WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Grosssalary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PFPrint in following format*/
public class JavaQA06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee ID :");
        int employeeID = scanner.nextInt();
        System.out.println("Enter employ Name :");
        String employName = scanner.next();
        System.out.println("Enter Basic Salary :");
        Double salary = scanner.nextDouble();

        double hra = 0.10 * salary;
        double da = 0.09 * salary;
        double ta = 0.08 * salary;
        double pf = 0.20 * salary;
        double grossSalary = salary + hra + da + ta - pf;
        System.out.println("|        Salary Slip             |");
        System.out.println("|                                |");
        System.out.println("----------------------------------");
        System.out.println("|Employee ID   :" + employeeID + "                |");
        System.out.println("|Employee name :" + employName + "                |");
        System.out.println("----------------------------------");
        System.out.println("|Basic salery  :" + salary + "      |");
        System.out.println("|HRA10%        :" + hra + "   |");
        System.out.println("|DA9%          :" + da + "   |");
        System.out.println("|TA8%          :" + ta + "   |");
        System.out.println("|PF-20&        :" + pf + "   |");
        System.out.println("----------------------------------");
        System.out.println("|Gross Salary  :" + grossSalary + "  |");
        System.out.println("|=================================|");


    }
}
