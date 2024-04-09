import java.util.ArrayList;
import java.util.List;

public class spiral {
    public static List<Integer> spiralOrder(int[][] matrix){
        List<Integer> result=new ArrayList<>();

        if (matrix==null||matrix.length==0) {
            return result;
        }

        int rows=matrix.length;
        int columns=matrix[0].length;
        int top=0,bottom=rows-1,left=0,right=columns-1;

        while (top<=bottom && left<=right) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            if (top<=bottom) {
                for (int i = right; i >=left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left<=right) {
                for (int i = bottom; i >=top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] matrix={
            {1,5,7,9,10,11},
            {6,10,12,13,20,21},
            {9,25,29,30,32,41},
            {15,55,59,63,68,70},
            {40,70,79,81,95,105}
        };

        List<Integer> result=spiralOrder(matrix);
        System.out.println("Spiral order traversal"+result);
    }
}
