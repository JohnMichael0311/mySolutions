class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int l =0;
        int r = 0;
        int jumps = 0;
        while(r<n-1){
            int fartherest = 0;
        for(int i = l; i<=r; i++){
            fartherest = Math.max(fartherest, i+nums[i]);
        }
        l = r+1;
        r = fartherest;
        jumps = jumps +1;
        }
        return jumps;

    }
}