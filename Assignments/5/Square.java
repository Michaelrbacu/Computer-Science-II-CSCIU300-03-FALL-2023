import java.util.Scanner;

public class Square {
    private int[][] square;

    // Create a new square of the given size
    public Square(int size) {
        square = new int[size][size];
    }

    // Return the sum of the values in the given row
    public int sumRow(int row) {
        int sum = 0;
        for (int col = 0; col < square.length; col++) {
            sum += square[row][col];
        }
        return sum;
    }

    // Return the sum of the values in the given column
    public int sumCol(int col) {
        int sum = 0;
        for (int row = 0; row < square.length; row++) {
            sum += square[row][col];
        }
        return sum;
    }

    // Return the sum of the values in the main diagonal
    public int sumMainDiag() {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[i][i];
        }
        return sum;
    }

    // Return the sum of the values in the other ("reverse") diagonal
    public int sumOtherDiag() {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[i][square.length - 1 - i];
        }
        return sum;
    }

    // Return true if the square is magic (all rows, cols, and diags have
    // the same sum), false otherwise
    public boolean magic() {
        int targetSum = sumRow(0); // The sum of the first row (the target sum)

        // Check rows
        for (int row = 1; row < square.length; row++) {
            if (sumRow(row) != targetSum) {
                return false;
            }
        }

        // Check columns
        for (int col = 0; col < square.length; col++) {
            if (sumCol(col) != targetSum) {
                return false;
            }
        }

        // Check main diagonal
        if (sumMainDiag() != targetSum) {
            return false;
        }

        // Check other diagonal
        if (sumOtherDiag() != targetSum) {
            return false;
        }

        // If all checks passed, it's a magic square
        return true;
    }

    // Read info into the square from the input stream associated with the
    // Scanner parameter
    public void readSquare(Scanner scan) {
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square.length; col++) {
                square[row][col] = scan.nextInt();
            }
        }
    }

    // Print the contents of the square, neatly formatted
    public void printSquare() {
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square.length; col++) {
                System.out.print(square[row][col] + " ");
            }
            System.out.println();
        }
    }
}
