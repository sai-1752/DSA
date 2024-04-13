import java.util.ArrayList;
import java.util.Arrays;

public class arraymissing {
    public static void main(String[] args) {
        int[] nums={1,2,4,5};
        missing(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void missing(int[] nums){
        int max=0;
        ArrayList<Integer> list=new ArrayList<>();
        for (Integer num : nums) {
            max=Math.max(max, num);
            list.add(num);
        }

        for (int i = 0; i < max; i++) {
            if (!list.contains(i)) {
                System.out.println("the missing elements in the list:"+i);
            }
        }
    }
}
