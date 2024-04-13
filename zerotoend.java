import java.util.ArrayList;
import java.util.List;

public class zerotoend{
    public static void move(int[] nums){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                list.add(nums[i]);
            } else {
                list1.add(nums[i]);
            }
        }
        
        list.addAll(list1);
        System.out.println(list);
    }
    
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        move(nums);
    }
}