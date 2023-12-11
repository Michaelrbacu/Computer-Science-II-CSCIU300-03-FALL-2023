
/**
 *
 * @author AIC
 */
public class QueueDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) //throws QueueException  //If you don't use try and catch, uncomment this
	{
        // TODO code application logic here
	try 
	{
       	 	Queue Q = new Queue(4);
        	if (Q.empty())
           	 System.out.println("empty");
      
       	 	Q.enqueue(1);
        	Q.enqueue(2);
        	Q.enqueue(3);
        	//Q.enqueue(4);  //try to uncomment this
        	System.out.println(Q.dequeue());
        	System.out.println(Q.dequeue());
        	System.out.println(Q.dequeue());
        	//System.out.println(Q.dequeue()); //try to uncomment this
	}
	catch (QueueException problem)
	{
		System.out.println ();
         	System.out.println ("The exception message is: " + problem.getMessage());
         	System.out.println ();
	}

    }
}
