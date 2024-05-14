import java.util.ArrayList;

public class subset {
    public static void print(int[] arr){
        int n=arr.length;
        int totalsubsets=(int)Math.pow(2, n)-1;

        for (int i = 0; i < totalsubsets; i++) {
            ArrayList<Integer> sub=new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i&(1<<j))>0) {
                    sub.add(arr[j]);
                }
            }
            System.out.println(sub);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        print(arr);
    }
}
