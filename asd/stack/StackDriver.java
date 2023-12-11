/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package stack;

/**
 *
 * @author AIC
 */
public class StackDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        stack S = new stack(4);
        if (S.empty())
            System.out.println("empty");
        S.push(1);
        S.push(2);
        S.push(3);
        S.push(4);
        S.push(5);
        System.out.println(S.pop());
        System.out.println(S.pop());
        System.out.println(S.pop());
        System.out.println(S.pop());
        System.out.println(S.pop());
       
       
    }
}
