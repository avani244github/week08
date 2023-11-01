package midweekhomework;

/*Print multiplication table of 24, 50 and 29 using loop.*/
public class Java02 {
    public static void main(String[] args) {
        int[] numbers = {24, 50, 29};
        for (int number : numbers) {
            System.out.println("Multiplication table of " + number
                    + ":");
            for (int i = 1; i <= 10; i++) {
                int result = number * i;
                System.out.println(number + "x" + i + " = " + result);
            }
            System.out.println();
        }
    }

}
