//********************************************************************
//  Student.java       Author: Lewis/Loftus
//
//  Represents a college student.
//********************************************************************

public class Student
{
    private String firstName, lastName;
    private Address homeAddress, schoolAddress;
    private static int numofStudents = 0; //track the number of Students objects

    //-----------------------------------------------------------------
    //  Constructor: Sets up this student with the specified values.
    //-----------------------------------------------------------------
    public Student(String first, String last, Address home,
            Address school)
    {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
	   numofStudents++; //increase by one when a new object is created
    }
//return the number of Students objects
    public static int getNumStudents ()
    {
        return numofStudents; 
    }

    //-----------------------------------------------------------------
    //  Returns a string description of this Student object.
    //-----------------------------------------------------------------
    public String toString()
    {
        String result;

        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress;

        return result;
    }
}
