class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        // int cnt1 = 0;
        // for(int i = 0; i<n ; i++){
        //     int cnt =0;
        //     for(int j = i; j<n; j++){
        //         if(nums[j]%2==1){
        //             cnt++;
        //             if(cnt==k){
        //                 cnt1++;
        //             }
        //         }
        //     }
        // }
        // return cnt1;

      return goal(nums, k) - goal(nums, k -1);
    }
    public int goal(int[] nums, int goal){
        int n = nums.length;
        if(goal<0) return 0;
        int sum = 0, l = 0, r = 0, cnt =0;
        while(r<n){
            sum+=(nums[r]%2);
            while(sum>goal){
                sum = sum - (nums[l]%2);
                l = l+1;
            }
            cnt = cnt+(r-l+1);
            r++;
        }
        return cnt;

    }
}