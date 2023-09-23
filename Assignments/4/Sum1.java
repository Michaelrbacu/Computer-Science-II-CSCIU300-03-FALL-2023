public class Sum1 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments");
        } else {
            int sum = 0;
            for (String arg : args) {
                try {
                    int num = Integer.parseInt(arg);
                    sum += num;
                } catch (NumberFormatException e) {
                    System.err.println("Error: Non-integer argument found - " + arg);
                }
            }
            System.out.println("Sum of integers: " + sum);
        }
    }
}
