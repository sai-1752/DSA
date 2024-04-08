import java.util.*;

public class twoDArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns");
        int col=sc.nextInt();

        int[][] matrix=new int[rows][col];

        System.out.println("Enter the elements of 2D array: ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("the elements of 2D array is: ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
