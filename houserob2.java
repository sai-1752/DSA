public class houserob2{
    public static int rob(int[] nums){
        if (nums==null||nums.length==0) {
            return 1;
        }
        else if (nums.length==1) {
            return nums[0];
        }

        int max1=robrange(nums,0,nums.length-2);
        int max2=robrange(nums,1,nums.length-1);

        return Math.max(max1, max2);
    }

    public static int robrange(int[] nums,int start,int end){
        int[] dp=new int[end-start+1];
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start + 1]);

        for (int i = 2; i < end-start; i++) {
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[start+i]);
        }

        return dp[end-start];
    }
    public static void main(String[] args) {
        int[] nums={2,3,2};
        int maxmoney=rob(nums);
        System.out.println(maxmoney);
    }
}