package Arrays;

import java.util.* ;

public class setzeros 
{
    public static void setZeros(int matrix[][]) 
    {
        ArrayList<Integer> row = new ArrayList<Integer>();
        ArrayList<Integer> col = new ArrayList<Integer>();

        // Find the rows and columns with zeros
        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[i].length; j++) 
            {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }

        // Set rows to zero
        for (int i = 0; i < row.size(); i++) 
        {
            int rowIndex = row.get(i);
            for (int j = 0; j < matrix[rowIndex].length; j++) 
            {
                matrix[rowIndex][j] = 0;
            }
        }

        // Set columns to zero
        for (int i = 0; i < col.size(); i++) 
        {
            int colIndex = col.get(i);
            for (int j = 0; j < matrix.length; j++) 
            {
                matrix[j][colIndex] = 0;
            }
        }
    }

    public static void main(String[] args) 
    {
        int[][] matrix = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
        };
        System.out.println("Before setting zeros:");
        printMatrix(matrix);

        setZeros(matrix);

        System.out.println("After setting zeros:");
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}