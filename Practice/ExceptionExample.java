import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample {

    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            // Handling the exception
            System.out.println("Error: " + e.getMessage());
        }
        try {
            // Code that may throw an exception
            String str = null;
            System.out.println(str.length()); // This will throw a NullPointerException
        } catch (ArithmeticException e) {
            // Handling ArithmeticException
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (NullPointerException e) {
            // Handling NullPointerException
            System.out.println("NullPointerException: " + e.getMessage());
        } catch (Exception e) {
            // Handling other exceptions
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            // Code that may throw an exception
            FileReader file = new FileReader("example.txt");
            // Perform file operations
        } catch (FileNotFoundException e) {
            // Handling FileNotFoundException
            System.out.println("File not found: " + e.getMessage());
        } finally {
            // Code in the finally block will always be executed
            System.out.println("Finally block: Closing resources");
        }

        try {
            // Outer try block
            try {
                // Inner try block
                int[] array = new int[5];
                System.out.println(array[10]); // This will throw an ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                // Handling ArrayIndexOutOfBoundsException inside the inner catch block
                System.out.println("Inner Catch: " + e.getMessage());
            }
            // Code after the inner try-catch block
        } catch (Exception e) {
            // Handling other exceptions in the outer catch block
            System.out.println("Outer Catch: " + e.getMessage());
        }

    }
        //IO Exception
    private static void readFile(String filename) throws IOException {
    
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } finally {
            if (br != null) {
                br.close();
            }
        }
    }
}
