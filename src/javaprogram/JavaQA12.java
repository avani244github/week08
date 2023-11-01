package javaprogram;

import java.util.Scanner;

/*Input any alphabet from “A" to “F” and print their
city name accordingly (use if else) ifany other alphabet should be
invalid entry. Same as above program-8 using switch statement.*/
public class JavaQA12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter character between A to F :");
        String cityname = scanner.next();

        switch (cityname) {
            case "A":
                System.out.println("Ahmedabad");
                break;
            case "B":
                System.out.println("Baroda");
                break;
            case "C":
                System.out.println("Chotila");
            case "D":
                System.out.println("Delhi");
            case "E":
                System.out.println("Elhabad");
            case "F":
                System.out.println("Fatehganj");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
