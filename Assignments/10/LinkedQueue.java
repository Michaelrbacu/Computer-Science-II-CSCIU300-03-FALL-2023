// *******************************************************************
//   LinkedQueue.java
//
//   A linked-list implementation of the classic FIFO queue interface. 
// *******************************************************************

public class LinkedQueue implements QueueADT {
    private Node front, back;
    private int numElements;

    // -------------------------------------------------------
    // Constructor -- initializes the front and back pointers
    // and the number of elements.
    // -------------------------------------------------------
    public LinkedQueue() {
        front = null;
        back = null;
        numElements = 0;
    }

    // --------------------------------------------------
    // Puts an item on the end of the queue
    // --------------------------------------------------
    public void enqueue(Object item) {
        Node newNode = new Node(item);
        numElements++;
        if (back == null) {
            front = newNode;
        } else {
            back.setNext(newNode);
        }
        back = newNode;
    }

    // -------------------------------------------------------
    // Removes and returns object from the front of the queue.
    // -------------------------------------------------------
    public Object dequeue() {
        Object item = null;
        if (!isEmpty()) {
            item = front.getElement();
            front = front.getNext();
            if (front == null) {
                back = null;
            }
            numElements--;
        }
        return item;
    }

    // -----------------------------------------------------
    // Returns true if the queue is empty, false otherwise.
    // -----------------------------------------------------
    public boolean isEmpty() {
        return numElements == 0;
    }

    // ----------------------------------------------------
    // Returns true if queue is full, but it never is.
    // ----------------------------------------------------
    public boolean isFull() {
        return false;
    }

    // ------------------------------------------------------
    // Returns the number of elements in the queue.
    // ------------------------------------------------------
    public int size() {
        return numElements;
    }

    // --------------------------------------------------------
    // Returns a string containing the elements of the queue
    // from first to last.
    // --------------------------------------------------------
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
