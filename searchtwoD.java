import java.util.Scanner;

public class searchtwoD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
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

        System.out.println("Enter the value of x: ");

        int x=sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j]==x) {
                    System.out.println("x found at location ("+i+","+j+")");
                }
            }
        }
    }
}
