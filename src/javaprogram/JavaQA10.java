package javaprogram;

import java.util.Scanner;

/*Write a java program input sales id, seller's name, sales amount,
and salary basic and then fined this sales Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%*/
public class JavaQA10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sales ID :");
        int salesID = scanner.nextInt();
        System.out.println("Enter seller's Name :");
        String sellerName = scanner.next();
        System.out.println("Enter sales Amount :");
        double salesamount = scanner.nextDouble();
        System.out.println("Enter Basic Salary :");
        double basicsalary = scanner.nextDouble();
        double commissionPercentage = 0.0;
        if (salesamount >= 50000) {
            commissionPercentage = 0.35;
        } else if (salesamount >= 30000) {
            commissionPercentage = 0.20;
        } else if (salesamount >= 20000) {
            commissionPercentage = 0.10;
        } else if (salesamount >= 10000) {
            commissionPercentage = 0.05;
        } else if (salesamount < 10000) {
            commissionPercentage = 0.02;
        }
        double salecommission = salesamount * commissionPercentage;
        System.out.println("Sales ID : " + salesID);
        System.out.println("Saller's Name :" + sellerName);
        System.out.println("Sales Amount :" + salesamount);
        System.out.println("Basic Salary :" + basicsalary);
        System.out.println("Sales Percentage :" + (commissionPercentage * 100) + "%");
        System.out.println("Sales Commission :" + salecommission);

    }
}
