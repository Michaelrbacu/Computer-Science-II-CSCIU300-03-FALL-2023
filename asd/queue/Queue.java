

/**
 *
 * @author AIC
 */
public class Queue {
    private int [] Q;
    private int head, tail;//head points to the front of the queue; tail points to the index where the new item should be inserted, in other words, the index next to the last item
    private int size;
    public final int DEFAULTSIZE=100;//default queje size
    
    public Queue (int size)
    {
        this.size = size;
        Q = new int[size];
        head = tail = 0;
    }
    
    public Queue ()
    {
        Q = new int[DEFAULTSIZE];
        size = DEFAULTSIZE;
        head = tail = 0;
    }
    
    public boolean empty()
    {
        if (head == tail)
            return true;
        else
            return false;
    }
    public boolean isFull()
    {
        if ((tail+1)%size == head)
            return true;
        else
            return false;
    }
    public void enqueue(int item) throws QueueException
    {
       if (isFull())
       {
	   QueueException problem = new QueueException ("Queue is Full.");
	   throw problem;
       }
       Q[tail] = item;
       tail = (tail + 1)%size;
    }
    
    public int dequeue() throws QueueException
    {
        if (empty())
        {
	    QueueException problem = new QueueException ("Queue is empty.");
	    throw problem;
        }
        int item = Q[head];
        head = (head + 1)%size;
        return item;
    }       
}





