/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package stack;

/**
 *
 * @author AIC
 */
public class stack {
    private int [] Stack;
    int top;
    int size;
    public stack(int size)
    {
        this.size = size;
        Stack = new int[size];
        top = -1;
    }
    
    public stack()
    {
        size = 100;
        Stack = new int[size];
        top = -1;
    }
    
    public boolean empty()
    {
        if (top == -1)
            return true;
        else
            return false;
    }
    public boolean isFull()
    {
        if (top == size-1)
            return true;
        else
            return false;
    }
    public void push(int item)
    {
       if (isFull())
       {
           System.out.println("Stack is Full.");
           return;
       }
       top ++;
       Stack[top] = item;
    }
    
    public int pop()
    {
        if (empty())
        {
            System.out.println("Stack is empty.");
            return -1;
        }
        int item = Stack[top];
        top--;
        return item;
    }        
}
