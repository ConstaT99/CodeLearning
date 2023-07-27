package Sort;

import java.util.Arrays;

public class MatrixRotate {

    public static void diagonal(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j <  i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    /*under development*/
    public static void counterDiagonal(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j <  matrix.length - 1 - i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - 1 - i][matrix.length - 1 - j];
                matrix[matrix.length - 1 - i][matrix.length - 1 - j] = temp;
            }
        }
    }


    public static void horizontal(int[][] matrix){
        for(int i = 0; i < matrix.length / 2; i++){
            for (int j = 0; j <  matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - i - 1][j];
                matrix[matrix.length - i -1][j] = temp;
            }
        }
    }
    public static void vertical(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j <  matrix.length / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length- 1 - j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
    }
    public static void print(int[][] matrix){
        for(int[] i : matrix){
            System.out.println(Arrays.toString(i));
        }
    }
    public static void main(String[] args) {
        int[][] matrix = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        print(matrix);
        horizontal(matrix);
        diagonal(matrix);
        print(matrix);
    }
}
