class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return goal(nums, goal) - goal(nums, goal -1);
    }
    public int goal(int[] nums, int goal){
        int n = nums.length;
        if(goal<0) return 0;
        int sum = 0, l = 0, r = 0, cnt =0;
        while(r<n){
            sum+=nums[r];
            while(sum>goal){
                sum = sum - nums[l];
                l = l+1;
            }
            cnt = cnt+(r-l+1);
            r++;
        }
        return cnt;

    }
}