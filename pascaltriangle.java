import java.util.ArrayList;
import java.util.List;

public class pascaltriangle {
    public static void main(String[] args) {
        int numRows=5;
        List<List<Integer>> result=generate(numRows);

        for (List<Integer> row : result) {
            System.out.println(row);    
        }
    }
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> triangle=new ArrayList<>();

        if (numRows==0) {
            return triangle;
        }
        List<Integer> firstRow=new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow=triangle.get(i-1);

            List<Integer> newRow=new ArrayList<>();

            newRow.add(1);

            for (int j = 1; j < i; j++) {
                newRow.add(prevRow.get(i-1)+prevRow.get(j));
            }

            newRow.add(1);

            triangle.add(newRow);
        }
        return triangle;
    }
}
