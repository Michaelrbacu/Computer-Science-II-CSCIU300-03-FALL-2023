//***********************************************************
// LinkedQueue.java
// A linked-list implementation of the classic FIFO queue interface.
//***********************************************************
public class LinkedQueue implements QueueADT {
    private Node front, back;
    private int numElements;

    //---------------------------------------------
    // Constructor; initializes the front and back pointers
    // and the number of elements.
    //---------------------------------------------
    public LinkedQueue() {
        front = back = null;
        numElements = 0;
    }

    //---------------------------------------------
    // Puts item on the end of the queue.
    //---------------------------------------------
    public void enqueue(Object item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            front = newNode;
        } else {
            back.setNext(newNode);
        }
        back = newNode;
        numElements++;
    }

    //---------------------------------------------
    // Removes and returns object from the front of the queue.
    //---------------------------------------------
    public Object dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }
        Object item = front.getElement();
        front = front.getNext();
        numElements--;
        if (isEmpty()) {
            back = null;
        }
        return item;
    }

    //---------------------------------------------
    // Returns true if the queue is empty.
    //---------------------------------------------
    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return false;
    }

    //---------------------------------------------
    // Returns the number of elements in the queue.
    //---------------------------------------------
    public int size() {
        return numElements;
    }

    //---------------------------------------------
    // Returns a string containing the elements of the queue
    // from first to last
    //---------------------------------------------
    public String toString() {
        String result = "\n";
        Node temp = front;
        while (temp != null) {
            result += temp.getElement() + "\n";
            temp = temp.getNext();
        }
        return result;
    }
}
