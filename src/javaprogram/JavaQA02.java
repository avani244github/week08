package javaprogram;

/*Declare array and store any 5 countries and print them in console.*/
public class JavaQA02 {
    public static void main(String[] args) {
        String[] countriesname = {
                "India", "China", "Italy", "Spain", "Germany"};

        for (String i : countriesname) {

            System.out.println("Countries name :" + i);
        }

    }
}
