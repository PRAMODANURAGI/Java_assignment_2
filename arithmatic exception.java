//A-2 Ques22

import java.util.Scanner;

class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message);
    }
}

public class ArithmeticCalculator {

    public static double calculate(int a, int b, char operator) throws CustomArithmeticException {
        try {
            switch (operator) {
                case '+':
                    return (double) a + b;

                case '-':
                    return (double) a - b;

                case '*':
                    
                    if (a != 0 && b != 0 && (a > Integer.MAX_VALUE / b || a < Integer.MIN_VALUE / b)) {
                        throw new CustomArithmeticException("Multiplication overflow detected.");
                    }
                    return (double) a * b;

                case '/':
                    if (b == 0) {
                        throw new CustomArithmeticException("Division by zero is not allowed.");
                    }
                    return (double) a / b;

                default:
                    throw new CustomArithmeticException("Invalid operator. Please use +, -, *, or /.");
            }
        } catch (ArithmeticException e) {
            throw new CustomArithmeticException("Arithmetic error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input from user
            System.out.print("Enter the first number (integer): ");
            int a = scanner.nextInt();

            System.out.print("Enter the second number (integer): ");
            int b = scanner.nextInt();

            System.out.print("Enter the operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            // Calculate the result
            double result = calculate(a, b, operator);
            System.out.println("The result of the calculation is: " + result);

        } catch (CustomArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}