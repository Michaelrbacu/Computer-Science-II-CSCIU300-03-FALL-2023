// ****************************************************************
// SquareTest.java
//
// Uses the Square class to read in square data and tell if 
// each square is magic.
//          
// ****************************************************************

import java.util.Scanner;
import java.io.*;

public class SquareTest {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("magicData"));

		int count = 1; // count which square we're on
		int size = scan.nextInt(); // size of next square

		// Expecting -1 at bottom of input file
		while (size != -1) {
			// create a new Square of the given size
			Square magicSquare = new Square(size);

			// call its read method to read the values of the square
			magicSquare.readSquare(scan);

			System.out.println("\n******** Square " + count + " ********");
			// print the square
			magicSquare.printSquare();

			// print the sums of its rows
			for (int row = 0; row < size; row++)
				System.out.println("Sum of row " + row + ": " +
						magicSquare.sumRow(row));

			// print the sums of its columns
			for (int col = 0; col < size; col++)
				System.out.println("Sum of column " + col + ": " +
						magicSquare.sumCol(col));

			// print the sum of the main diagonal
			System.out.println("Sum of the main diagonal: " +
					magicSquare.sumMainDiag());

			// print the sum of the other diagonal
			System.out.println("Sum of the other diagonal: " +
					magicSquare.sumOtherDiag());

			// determine and print whether it is a magic square
			if (magicSquare.magic())
				System.out.println("It's a magic square!");
			else
				System.out.println("It's not a magic square!");

			System.out.println();

			// get size of next square
			size = scan.nextInt();
			count++;
		}

	}
}
