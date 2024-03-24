import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class intersection {
    public static int[] intersec(int[] nums1, int[] nums2){
        Set<Integer> set= new HashSet<>();
        Set<Integer> intersect=new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }
        
        for (int num : nums2) {
            if (set.contains(num)) {
                intersect.add(num);
            }            
        }

        int[] result=new int[intersect.size()];
        int index=0;
        for (int num : intersect) {
            result[index++]=num;    
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        int[] result=intersec(nums1, nums2);

        System.out.println("intersection of two arrays :"+Arrays.toString(result));
    }
}
