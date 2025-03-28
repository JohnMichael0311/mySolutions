class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        // int[] ans = new int[n];
        // int[] neg = new int[m];
        // for(int i = 0; i<m; i++){
        //     neg[i] = -1;
        //     for(int j = i+1 ; j<m; j++){
        //         if(nums2[i]<nums2[j]) {
        //             neg[i] = nums2[j];
        //             break;
        //     }
        // }
        // }
        // for(int i = 0; i<n; i++){
        //     ans[i] = -1;
        //     for(int j = 0 ; j<m; j++){
        //         if(nums1[i]==nums2[j]) {
        //             ans[i] = neg[j]; 
        //             break;
        //         }
                
        //     }
        // }
        

        // return ans;
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> mpp = new HashMap<>();
        
        for(int i = 0 ; i<m; i++){
            while(!stack.isEmpty() && stack.peek()< nums2[i]){
                mpp.put(stack.pop(), nums2[i]);

            }
            
            stack.push(nums2[i]);
        }

        int[] ans = new int[n];
        for(int i = 0; i<n; i++){
            ans[i] = mpp.getOrDefault(nums1[i], -1);
        }
        return ans;
    }

}
