public class RecursiveExamples {
    public static void main(String[] args) {
        // Factorial Example
        int factorialNumber = 5;
        int factorialResult = factorial(factorialNumber);
        System.out.println("Factorial of " + factorialNumber + " is: " + factorialResult);

        // Fibonacci Example
        int fibonacciNumber = 8;
        System.out.println("Fibonacci series up to " + fibonacciNumber + " terms:");
        for (int i = 0; i < fibonacciNumber; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();

        // Recursive Sum of an Array Example
        int[] array = {1, 2, 3, 4, 5};
        int sum = sumArray(array, 0);
        System.out.println("Sum of the array elements: " + sum);
    }

    // Factorial Function
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Fibonacci Function
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // Recursive Sum of an Array Function
    static int sumArray(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        } else {
            return arr[index] + sumArray(arr, index + 1);
        }
    }
}
