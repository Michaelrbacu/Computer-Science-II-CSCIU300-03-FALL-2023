package Practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample {

    public static void main(String[] args) {
        try {
            // Example 1: ArithmeticException
            int result = 10 / 0; // This will throw an ArithmeticException

            // Example 2: ArrayIndexOutOfBoundsException
            int[] arr = new int[5];
            int value = arr[10]; // This will throw an ArrayIndexOutOfBoundsException

            // Example 3: NullPointerException
            String str = null;
            int length = str.length(); // This will throw a NullPointerException

            // Example 4: IOException
            readFile("nonexistent_file.txt");

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        } catch (Exception e) {
            // This will catch any other exceptions not explicitly handled above
            System.out.println("Caught an unexpected exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }

    private static void readFile(String filename) throws IOException {
        // Example of throwing and propagating an IOException
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
