package javaprogram;

import java.util.Arrays;

/*Write a Java program to calculate the average value of array elements.*/
public class JavaQA22 {
    public static void main(String[] args) {
        int[] numericArray =
                {10, 20, 20, 50};
        int sum = Arrays.stream(numericArray).sum();
        int length = numericArray.length;
        double average = sum / length;


        System.out.println("The Average value of Array : " + average);

    }
}


