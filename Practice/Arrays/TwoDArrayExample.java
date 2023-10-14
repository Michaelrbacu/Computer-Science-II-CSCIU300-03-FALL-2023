public class TwoDArrayExample {
    public static void main(String[] args) {

        int[][] matrix = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = i * 4 + j + 1;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("");

int[][] twoDArray = new int[3][4];

int element = twoDArray[0][1];

for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 4; j++) {
        System.out.print(twoDArray[i][j] + " ");
    }
    System.out.println(); 
}



    }
}
