package javaprogram;

/*Declare multidimensional array and store 5 countries and their capital and print them in
console.*/
public class JavaQA03 {
    public static void main(String[] args) {
        String[][] countriesandcapitals = {

                {"India", "Delhi"},
                {"Japan", "Tokyo"},
                {"China", "Beijing"},
                {"Italy", "rome"},
                {"United Kingdom", "london"}};
        for (int i = 0; i < countriesandcapitals.length; i++) {
            String country = countriesandcapitals[i][0];
            String capital = countriesandcapitals[i][1];
            System.out.println("Country name :" + country + ",  Capital is :" + capital);
        }
    }

}
