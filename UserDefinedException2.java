//A-2 Ques26


import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class PersonInfo {

    public static void validateAge(String name, int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Invalid age entered for " + name + ": Age cannot be negative.");
        } else {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = scanner.nextInt();

           ValidateAge(name,age);

        } catch (InvalidAgeException e) {
            // Handling the InvalidAgeException
            System.out.println("Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}