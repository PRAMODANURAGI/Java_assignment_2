   //  Question 17  //

import java.util.Scanner;

public class ConsecutiveDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a digit: ");
        String digits = scanner.next();

        int sum = 0;

        for (int i = 0; i < digits.length(); i++) {
            sum += Integer.parseInt(digits.substring(0, i + 1));
        }
        System.out.println("Sum of numbers formed by consecutive digits: " + sum);

        scanner.close();
    }
}
