class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] ans = new int[n];
        // for(int i = 0; i<n; i++){
        //     for(int j = i+1 ; j<i+n-1; j++){
        //         int index = j % n;
        //         if(nums[index]>nums[i]) {
        //         ans[i] = nums[index]; 
        //         break;
        //         }
        //     }
        // }
        for(int i = (2*n - 1); i>=0; i--){
            int index = i % n;
            while(!st.isEmpty() && st.peek()<=nums[index]){
                st.pop();
            }
            
            if(i<n) {
                if(st.isEmpty()) ans[i] = -1;
                else ans[i] = st.peek();
            }
            // else if(i == n-1 && nums[0] > nums[n-1]) ans[i] = nums[0];
            // else if( i==0 && nums[n-1] > nums[0] ) ans[i] = nums[n-1];
            // else ans[i] = st.peek();
            st.push(nums[index]); 
        }
        return ans;
    }
}