package Matching;
import java.util.*;

public class ParenMatch {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String line; 
        Scanner scan = new Scanner(System.in);
        System.out.println("\nParenthesis Matching");
        System.out.print("Enter a parenthesized expression: ");
        line = scan.nextLine();


        for (int i = 0; i < line.length(); i++) {
            char currentChar = line.charAt(i);

            
            if (currentChar == '(' || currentChar == ')') {
                if (currentChar == '(') {
                    
                    s.push(currentChar);
                } else {
                    
                    if (s.isEmpty()) {
                        System.out.println("Error: Extra right parenthesis at position " + (i+1));
                        System.out.println(line.substring(0, i + 1));
                        return;
                    } else {
                        
                        s.pop();
                    }
                }
            }
        }

        
        if (s.isEmpty()) {
            System.out.println("Parentheses match!");
        } else {
            System.out.println("Error: Extra left parenthesis");
            System.out.println(line.substring(0, line.indexOf(s.peek())));
        }
    }
}
