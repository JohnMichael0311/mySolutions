class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int prev = 0;
        for(int i = 0; i< n; i++){
            // prev = nums[i];
            // while(prev!=0){
            //     if(nums[prev]==n){
            //         return true;
            //     } 
            //     else if(nums[prev]==) {
            //         nums[prev]
            //     }
            //     prev--;
            //     continue;
            if(i>prev){
                return false;
            }
            prev = Math.max(prev , nums[i] +i);
            
            }
            return true;

        
        }
        
    }

