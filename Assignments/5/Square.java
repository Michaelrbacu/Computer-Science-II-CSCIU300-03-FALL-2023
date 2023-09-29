/*
Magic Squares
One interesting application of two-dimensional arrays is magic squares. A magic square is a square matrix in which the sum of every row, every column, and both diagonals is the same. Magic squares have been studied for many years, and there are some particularly famous magic squares. In this exercise you will write code to determine whether a square is magic.

File Square.java contains the shell for a class that represents a square matrix. It contains headers for a constructor that gives the size of the square and methods to read values into the square, print the square, find the sum of a given row, find the sum of a given column, find the sum of the main (or other) diagonal, and determine whether the square is magic. The read method is given for you; you will need to write the others. Note that the read method takes a Scanner object as a parameter.

File SquareTest.java contains the shell for a program that reads input for squares from a file named magicData and tells whether each is a magic square. Following the comments, fill in the remaining code. Note that the main method reads the size of a square, then after constructing the square of that size, it calls the readSquare method to read the square in. The readSquare method must be sent the Scanner object as a parameter.
You should find that the first, second, and third squares in the input are magic, and that the rest (fourth through seventh) are not. Note that the -1 at the bottom tells the test program to stop reading.
*/
// Square.java
//
// Define a Square class with methods to create and read in
// info for a square matrix and to compute the sum of a row,
// a col, either diagonal, and whether it is magic.
//
// ***************************************************************
import java.util.Scanner;
public class Square
{
int[][] square;
//--------------------------------------
//create new square of given size
//--------------------------------------
public Square(int size)
{
}
//--------------------------------------
//return the sum of the values in the given row
//--------------------------------------
public int sumRow(int row)
{
    return int;
}
//--------------------------------------
//return the sum of the values in the given column
//--------------------------------------
public int sumCol(int col)
{
    return int;
}
//--------------------------------------
//return the sum of the values in the main diagonal
//--------------------------------------
public int sumMainDiag()
{
    return int;
}
//--------------------------------------
//return the sum of the values in the other ("reverse") diagonal
//--------------------------------------
public int sumOtherDiag()
{
    return int;
}
//--------------------------------------
//return true if the square is magic (all rows, cols, and diags have
//same sum), false otherwise
//--------------------------------------
public boolean magic()
{
    return boolean;
}
//--------------------------------------
//read info into the square from the input stream associated with the
//Scanner parameter
//--------------------------------------
public void readSquare(Scanner scan)
{
for (int row = 0; row < square.length; row++)
for (int col = 0; col < square.length; col ++)
square[row][col] = scan.nextInt();
}
//----------------------------------------
//print the contents of the square, neatly formatted
//----------------------------------------
public void printSquare()
{
}
}



