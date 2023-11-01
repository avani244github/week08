package javaprogram;

import java.util.Arrays;

/*Write a Java program to sum values of an array.*/
public class JavaQA21 {
    public static void main(String[] args) {
        int[] numericArray =
                {34, 45, 56, 67};
        int sum = Arrays.stream(numericArray).sum();
        System.out.println("Sum value of an Array : " + sum);

    }
}
