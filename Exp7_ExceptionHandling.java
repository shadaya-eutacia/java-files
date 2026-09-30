public class Exp7_ExceptionHandling {

    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older for registration.");
        }
        System.out.println("Age " + age + " is valid. Registration successful!");
    }

    public static void main(String[] args) {
        System.out.println("=== Testing Valid Age ===");
        try {
            validateAge(20);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("\n=== Testing Invalid Age ===");
        try {
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Validation process completed.");
        }
    }
}