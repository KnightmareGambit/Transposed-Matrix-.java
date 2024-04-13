package Question02;
public class Main {
    public static void main(String[] args){
        int row = 3, column = 3;
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8,9}};
        display(matrix);

        int[][] transposedMatrix = new int[column][row];
        for (int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        display(transposedMatrix);
    }

    public static void display(int[][] matrix){
        System.out.println("The matrix is: ");
        for(int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}
