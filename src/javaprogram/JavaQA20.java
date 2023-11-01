package javaprogram;

import java.util.Arrays;

/*Write a Java program to sort a numeric array and a string array.*/
public class JavaQA20 {
    public static void main(String[] args) {
        int[] numericArray = {201, 202, 207, 200, 205};
        String[] stringArray = {"Avani", "Roshani", "Jay"};

        System.out.println("Actual Numeric Array : " + Arrays.toString(numericArray));
        Arrays.sort(numericArray);
        System.out.println(Arrays.toString(numericArray));
        System.out.println("Actual String Array : " + Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));


    }
}
