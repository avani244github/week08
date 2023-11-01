package javaprogram;

/*Write a Java program to reverse a word.
Sample Output:
Input a word: dsaf
Reverse word: fasd*/
public class JavaQA26 {
    public static void main(String[] args) {
        String word = "dsaf";
        String reverseWord = reverseWord(word);
        System.out.println("Original Word : " + word);
        System.out.println("Reverse Word : " + reverseWord);
    }

    public static String reverseWord(String word) {
        StringBuilder reverse = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse.append(word.charAt(i));
        }
        return reverse.toString();
    }
}
