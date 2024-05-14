import java.util.Scanner;

public class minimumopertaions {
    public static boolean isprime(int n){
        if (n<=1) {
            return false;
        }
        if (n<=3) {
            return true;
        }
        if (n%2==0 && n%3==0) {
            return false;
        }
        for (int i = 5; i*i <=n; i+=6) {
            if (n%i==0 || n%(i+2)==0) {
                return false;
            }
        }
        return true;
    }
    static int minimumnumberofopertaions(int[][] matrix){
        int rows=matrix.length;
        int cols=matrix[0].length;

        int[] rowCount=new int[rows];
        int[] colCount=new int[cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (isprime(matrix[i][j])) {
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }

        int minop=Integer.MAX_VALUE;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int ops=rows-rowCount[i]+cols-colCount[j];
                minop=Math.min(minop, ops);
            }
        }
        return minop;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // Number of rows
        int M = scanner.nextInt(); // Number of columns

        // Input the matrix elements
        int[][] matrix = new int[N][M];
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < M; ++j) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Calculate and print the minimum number of operations
        int minOperations =minimumnumberofopertaions(matrix);
        System.out.println(minOperations);
    }
}
