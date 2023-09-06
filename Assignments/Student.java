//********************************************************************
//  Student.java       Author: Lewis/Loftus
//
//  Represents a college student.
//********************************************************************

public class Student
{
    public static int numStudents;
    private String firstName, lastName;
    private Address homeAddress, schoolAddress;

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
        numStudents++;
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
    public static int getNumStudents()
    {
    
    return numStudents;
    
    }
    
    
}