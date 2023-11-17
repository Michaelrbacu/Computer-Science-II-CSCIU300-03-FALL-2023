import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args) {
        int val, sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a line of text");
        Scanner scanLine = new Scanner(scan.nextLine());

        try {
            while (scanLine.hasNext()) {
                val = Integer.parseInt(scanLine.next());
                sum += val;
            }
        } catch (NumberFormatException e) {
            // Catch NumberFormatException and do nothing
        }

        System.out.println("The sum of the integers on this line is " + sum);
    }
    
}


