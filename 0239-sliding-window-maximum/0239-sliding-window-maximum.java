class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        // int[] ans = new int[n-k + 1];
        
        // for(int i = 0; i<=n-k; i++){
        //     int maxi = nums[i];
        //     for(int j = i; j<i+k; j++){
        //         maxi = Math.max(nums[j], maxi );
                 
        //     }
        //     ans[i] = maxi; 
            
        // }
        // return ans;
        Deque <Integer> dq = new LinkedList<>();
        int[] ans = new int[n-k+1];
        for(int i = 0; i<n; i++){
            if(!dq.isEmpty() && dq.peekFirst() <= i - k ){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){
                dq.removeLast();
            }
            dq.offerLast(i);
            if(i>=k-1) ans[i-k+1] = nums[dq.peekFirst()];
        }
        return ans;
    }
}