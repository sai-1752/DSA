import java.util.*;
public class grouparray {
    public static int[][] group(int[] array1,int[] array2){
        if (array1.length!=array2.length) {
            throw new IllegalArgumentException("Arrays must have same length");
        }
        int[][] pairs=new int[array1.length][2];

        for (int i = 0; i < array1.length; i++) {
            pairs[i][0]=array1[i];
            pairs[i][1]=array2[i];
        }
        return pairs;
    }
    public static void main(String[] args) {
        int[] array1={1,2,3,4};
        int[] array2={5,6,7,8};

        int[][] pairs=group(array1, array2);

        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }
    }
}
