// ****************************************************************
// IntegerListTest.java
//
// Provide a menu-driven tester for the IntegerList class.
//
/*
 * Searching and Sorting In An Integer List
File IntegerList.java contains a Java class representing a list of integers. The following public methods are
provided:
 IntegerList(int size)—creates a new list of size elements. Elements are initialized to 0.
 void randomize()—fills the list with random integers between 1 and 100, inclusive.
 void print()—prints the array elements and indices
 int search(int target)—looks for value target in the list using a linear (also called sequential) search
algorithm. Returns the index where it first appears if it is found, -1 otherwise.
 void selectionSort()—sorts the lists into ascending order using the selection sort algorithm.
File IntegerListTest.java contains a Java program that provides menu-driven testing for the IntegerList class.
Copy both files to your directory, and compile and run IntegerListTest to see how it works. For example, create
a list, print it, and search for an element in the list. Does it return the correct index? Now look for an element
that is not in the list. Now sort the list and print it to verify that it is in sorted order.
Modify the code in these files as follows:
1. Add a method void replaceFirst(int oldVal, int newVal) to the IntegerList class that replaces the first
occurrence of oldVal in the list with newVal. If oldVal does not appear in the list, it should do nothing (but
it’s not an error). If oldVal appears multiple times, only the first occurrence should be replaced. Note that
you already have a method to find oldVal in the list; use it!
Add an option to the menu in IntegerListTest to test your new method.
2. Add a method void replaceAll(int oldVal, int newVal) to the IntegerList class that replaces all occurrences
of oldVal in the list with newVal. If oldVal does not appear in the list, it should do nothing (but it’s not an
error). Does it still make sense to use the search method like you did for replaceFirst, or should you do
your own searching here? Think about this.
Add an option to the menu in IntegerListTest to test your new method.
3. Add a method void sortDecreasing() to the IntegerList class that sorts the list into decreasing (instead of
increasing) order. Use the selection sort algorithm, but modify it to sort the other way. Be sure you change
the variable names so they make sense!
Add an option to the menu in IntegerListTest to test your new method.
4. Add a method int binarySearchD (int target) to the IntegerList class that uses a binary search to find the
target assuming the list is sorted in decreasing order. If the target is found, the method should return its
index; otherwise the method should return –1. Your algorithm will be a modification of the binary search
algorithm in listing 10.12 of the text.
Add an option to the menu in IntegerListTest to test your new method. In testing, make sure your method
works on a list sorted in descending order then see what the method does if the list is not sorted
(it shouldn’t be able to find some things that are in the list). */
// ****************************************************************
import java.util.Scanner;
public class IntegerListTest
{
    static IntegerList list = new IntegerList(10);
    static Scanner scan = new Scanner(System.in);
//-------------------------------------------------------
// Create a list, then repeatedly print the menu and do what the
// user asks until they quit
//-------------------------------------------------------
public static void main(String[] args)
{
    printMenu();
    int choice = scan.nextInt();
    while (choice != 0)
    {
    dispatch(choice);
    printMenu();
    choice = scan.nextInt();
    }
}
//-------------------------------------------------------
// Do what the menu item calls for
//-------------------------------------------------------

public static void dispatch(int choice)
{
    int loc;
    switch(choice)
    {
    case 0:
    System.out.println("Bye!");
    break;
    case 1:
    System.out.println("How big should the list be?");
    int size = scan.nextInt();
    list = new IntegerList(size);
    list.randomize();
    break;
    case 2:
    list.selectionSort();
    break;
    case 3:
    System.out.print("Enter the value to look for: ");
    loc = list.search(scan.nextInt());
    if (loc != -1)
    System.out.println("Found at location " + loc);
    else
    System.out.println("Not in list");
    break;
    case 4:
    list.print();
    break;
    default:
    System.out.println("Sorry, invalid choice");
    }
}
//------------------------------------------------------
// Print the user's choices
//------------------------------------------------------
public static void printMenu()
{
    System.out.println("\n Menu ");
    System.out.println(" ====");
    System.out.println("0: Quit");
    System.out.println("1: Create a new list (** do this first!! **)");
    System.out.println("2: Sort the list using selection sort");
    System.out.println("3: Find an element in the list using linear search");
    System.out.println("4: Print the list");
    System.out.print("\nEnter your choice: ");
}
}
