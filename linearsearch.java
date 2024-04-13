public class linearsearch {
    public static int Linear(int[] nums,int target){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int target=3;
        int index=Linear(nums, target);
        if (index!=-1) {
            System.out.println( +target+ " found at index " +index);
        }
        else{
            System.out.println("not found");
        }
    }
}
