//A-2 Ques24

class TooOlder extends Exception {
    public TooOlder(String message) {
        super(message);
    }
}
class TooYounger extends Exception {
    public TooYounger(String message) {
        super(message);
    }
}

public class RecruitmentSystem {
    public static void checkEligibility(String name, int age) throws TooOlder, TooYounger {
        if (age > 45) {
            throw new TooOlder("Candidate is too old: Age " + age + " is above the limit.");
        } else if (age < 20) {
            throw new TooYounger("Candidate is too young: Age " + age + " is below the limit.");
        } else {
            System.out.println("Eligible Candidate: " + name);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the candidate's name: ");
            String name = scanner.nextLine();

            System.out.print("Enter the candidate's age: ");
            int age = scanner.nextInt();
            checkEligibility(name, age);

        } catch (TooOlder e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (TooYounger e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}