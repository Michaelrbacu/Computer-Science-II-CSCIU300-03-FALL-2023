
public class LinkedQueue implements QueueADT {
    private Node front, back;
    private int numElements;

    
    
    public LinkedQueue() {
        front = back = null;
        numElements = 0;
    }

    
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

    
    public Object dequeue() {
        if (isEmpty()) {
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

    
    public boolean isEmpty() {
        return numElements == 0;
    }

    
    public boolean isFull() {
        return false;
    }

    
    public int size() {
        return numElements;
    }

    
    
    public String toString() {
        StringBuilder result = new StringBuilder("\n");
        Node temp = front;
        while (temp != null) {
            result.append(temp.getElement()).append("\n");
            temp = temp.getNext();
        }
        return result.toString();
    }
}
