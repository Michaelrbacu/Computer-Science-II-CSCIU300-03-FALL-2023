//*******************************************************
// Parameters.java
//
// Illustrates the concept of a variable parameter list.
//*******************************************************
import java.util.Scanner;
public class Parameters
{
    //-----------------------------------------------
    // Calls the average method with
    // different numbers of parameters.
    //-----------------------------------------------
    public static void main(String[] args)
    {
        double mean1, mean2, min1, min2;
        
        mean1 = average(42, 69, 37);
        min1 = min(42, 69, 37);
        mean2 = average(35, 43, 93, 23, 40, 21, 75);
        min2 = min(35, 43, 93, 23, 40, 21, 75);
        
        System.out.println ("mean1 = " + mean1);
        System.out.println("min1 = "+ min1);
        System.out.println ("mean2 = " + mean2);
        System.out.println("min2 = "+ min2);
        
        System.out.println(average(13));
        System.out.println(average());
        
    }
    //----------------------------------------------
    // Returns the average of its parameters.
    //----------------------------------------------
    
    /*
      1.	Compile and run the program. 
      2.	Add a call to find the average of a single integer, say 13. Print the result of the call.
      3.	Add a call with an empty parameter list and print the result. Is the behavior what you expected?
      4.	Add a method minimum that takes a variable number of integer parameters and returns the minimum of the parameters. Invoke your method on each of the parameter lists used for the average function.
    */
    
    public static double average (int ... list)
    {
        double result = 0.0;
        if (list.length != 0)
        {
            int sum = 0;
            for (int num: list)
            sum += num;
            result = (double)sum / list.length;
        }
        return result;
    }
    
public static double min (int ... args)
{
        if(args.length==0)
        {
            System.out.println("No Arguments");
        }
        else
        {
            double minval=Double.MAX_VALUE;
            for (int num: args)
                {
                    if(num<minval)
                        {
                            minval=num;
                        }
                }
                System.out.println(minval);
                return minval;
        }
   return 0;
}
}

/*public double average(int . . . list)
 * {
 *  double result =0.0;
 *  if (list.length!=0)
 *      {
 *      int sum=0;
 *      for (int num: list)
 *          {
 *          sum+=num;
 *          }
 *      result=(double)sum/list.length
 *      }
 *  return result;
 * }
 */
