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

            square.printSquare();

            // Calculate and print the sum of each row
            for (int row = 0; row < size; row++) {
                int rowSum = square.sumRow(row);
                System.out.println("Sum of Row " + (row + 1) + ": " + rowSum);
            }

            // Calculate and print the sum of each column
            for (int col = 0; col < size; col++) {
                int colSum = square.sumCol(col);
                System.out.println("Sum of Column " + (col + 1) + ": " + colSum);
            }

            // Calculate and print the sum of the main diagonal
            int mainDiagSum = square.sumMainDiag();
            System.out.println("Sum of Main Diagonal: " + mainDiagSum);

            // Calculate and print the sum of the other ("reverse") diagonal
            int otherDiagSum = square.sumOtherDiag();
            System.out.println("Sum of Other Diagonal: " + otherDiagSum);

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
