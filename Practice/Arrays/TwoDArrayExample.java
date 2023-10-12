public class TwoDArrayExample {
    public static void main(String[] args) {
        // Declare and initialize a 2D array
        int[][] matrix = new int[3][4];

        // Fill the 2D array with values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = i * 4 + j + 1;
            }
        }

        // Access and print elements in the 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
        System.out.println("");
        System.out.println("");

            // Declare a 2D array with 3 rows and 4 columns
int[][] twoDArray = new int[3][4];

int element = twoDArray[0][1];

for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 4; j++) {
        System.out.print(twoDArray[i][j] + " ");
    }
    System.out.println(); // Move to the next row
}


    }
}
