public class RecursiveExample {

    public static void main(String[] args) {
        // Example 1: Basic recursive try-catch
        try {
            recursiveMethod1(5);
        } catch (Exception e) {
            System.out.println("Example 1 - Exception caught: " + e.getMessage());
        }

        // Example 2: Recursive with multiple catch blocks
        try {
            recursiveMethod2(5);
        } catch (ArithmeticException e) {
            System.out.println("Example 2 - ArithmeticException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Example 2 - RuntimeException caught: " + e.getMessage());
        }

        // Example 3: Recursive with finally block
        try {
            recursiveMethod3(5);
        } catch (Exception e) {
            System.out.println("Example 3 - Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Example 3 - Finally block: Cleaning up resources");
        }
    }

    // Example 1: Basic recursive try-catch
    private static void recursiveMethod1(int n) {
        if (n > 0) {
            // Recursive call
            recursiveMethod1(n - 1);
            // Code that may throw an exception
            if (n == 3) {
                throw new RuntimeException("Example 1 - Exception at n=3");
            }
        }
    }

    // Example 2: Recursive with multiple catch blocks
    private static void recursiveMethod2(int n) {
        if (n > 0) {
            // Recursive call
            recursiveMethod2(n - 1);
            // Code that may throw exceptions
            if (n % 2 == 0) {
                throw new ArithmeticException("Example 2 - ArithmeticException at even n");
            }
            if (n == 3) {
                throw new RuntimeException("Example 2 - RuntimeException at n=3");
            }
        }
    }

    // Example 3: Recursive with finally block
    private static void recursiveMethod3(int n) {
        if (n > 0) {
            try {
                // Recursive call
                recursiveMethod3(n - 1);
                // Code that may throw an exception
                if (n == 3) {
                    throw new RuntimeException("Example 3 - Exception at n=3");
                }
            } finally {
                System.out.println("Example 3 - Finally block in recursiveMethod3: n=" + n);
            }
        }
    }
}
