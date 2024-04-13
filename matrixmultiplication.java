import java.util.Scanner;

public class matrixmultiplication {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("enter the number of rows of 1st matrix : ");
        int rows1=scanner.nextInt();
        System.out.println("enter the number of columns of 1st matrix: ");
        int columns1=scanner.nextInt();

        System.out.println("enter the number of rows of 2nd matrix : ");
        int rows2=scanner.nextInt();
        System.out.println("enter the number of columns of 2nd matrix: ");
        int columns2=scanner.nextInt();

        if (columns1!=rows2) {
            System.out.println("matrrix multiplication is not possible");
            return;
        }

        int[][] matrix1=new int[rows1][columns1];
        int[][] matrix2=new int[rows2][columns2];
        int[][] resultantmatrix=new int[rows1][columns2];

        System.out.println("enter the elements of first matrix: ");
        inputMatrix(scanner,matrix1);

        System.out.println("enter the elements of second matrix: ");
        inputMatrix(scanner,matrix2);

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k= 0; k < columns1; k++) {
                    resultantmatrix[i][j]+=matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("resultant matrix");
        printmatrix(resultantmatrix);
    }

        public static void inputMatrix(Scanner scanner,int[][] matrix){
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j]=scanner.nextInt();
                }
            }
        }
        
        public static void printmatrix(int[][] matrix){
            for (int[] rows : matrix) {
                for (int element : rows) {
                    System.out.print(element+" ");
                }
                System.out.println();
            }
        }
    }

