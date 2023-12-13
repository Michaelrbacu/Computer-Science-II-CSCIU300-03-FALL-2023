package Matching;

//**************************************************************
// ParenMatch.java
//
// Determines whether or not a string of characters contains
// matching left and right parentheses.
//**************************************************************

import java.util.*;
import java.util.Scanner;

public class ParenMatch {
    public static void main(String[] args) {
        Stack s = new Stack();
        String line; // the string of characters to be checked
        Scanner scan = new Scanner(System.in);

        System.out.println("\nParenthesis Matching");
        System.out.print("Enter a parenthesized expression: ");
        line = scan.nextLine();

        boolean ok = true;
        for (int i = 0; i < line.length() & ok; i++) {
            String ch = line.substring(i, i + 1);
            if (ch.equals("("))
                s.push(ch);
            else if (ch.equals(")"))
                if (s.empty()) {
                    System.out.println("Extra right parenthesis");
                    System.out.println(line.substring(0, i + 1));
                    ok = false;
                } else
                    s.pop();
        }

        if (ok)
            if (s.empty())
                System.out.println("Parentheses Match");
            else
                System.out.println("More left parentheses than right");
    }
}
