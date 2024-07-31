import java.util.Arrays;

public class alternatesorting {
    public static void rearrangeArray(int[] arr){
        Arrays.sort(arr);

        int[] result =new int[arr.length];

        int left=0;
        int right=arr.length-1;

        boolean flag=true;

        for (int i = 0; i < arr.length; i++) {
            if (flag) {
                result[i]=arr[right--];
            }
            else{
                result[i]=arr[left++];
            }
            flag=!flag;
        }
        System.arraycopy(result, 0, arr, 0, arr.length);
    }
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 6, 7};
        rearrangeArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
