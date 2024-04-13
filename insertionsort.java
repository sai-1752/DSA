public class insertionsort {
    public static void sort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] nums={7,8,3,1,2};

        for (int i = 1; i < nums.length; i++) {
            int current=nums[i];
            int j=i-1;
            while (j>=0 && current<nums[j]) {
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=current;
        }
        sort(nums);
    }
}
