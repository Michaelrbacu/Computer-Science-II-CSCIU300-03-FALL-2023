import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SquareTest {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("magicData"));
        int count = 1; // Count which square we're on
        int size = scan.nextInt();

        // Expecting -1 at the bottom of the input file
        while (size != -1) {
            System.out.println("\n******** Square " + count + " ********");

            // Create a new square of the given size
            Square square = new Square(size);

            // Read the square data into the square
            square.readSquare(scan);

            // Check if the square is magic and print the result
            if (square.magic()) {
                System.out.println("Magic Square!");
            } else {
                System.out.println("Not a Magic Square.");
            }

            // Increment the square count and read the next size
            count++;
            size = scan.nextInt();
        }
    }
}
