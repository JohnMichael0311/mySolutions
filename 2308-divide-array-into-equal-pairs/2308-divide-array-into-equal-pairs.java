class Solution {
    public boolean divideArray(int[] nums) {
        int n = nums.length;
        // int cnt = 0;
        // for(int i = 0; i<n; i++){
        // for(int j = i+1 ; j<n; j++){
        // if(nums[j]==nums[i]){
        // cnt++;
        // break;
        // }
        // }
        // }

        // if(n/2 == cnt) return true;
        // else return false;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
        }
        int cnt = 0;
        for (int value : mpp.values()) {
            if (value % 2 != 0)
                return false;
        }
        return true;
    }
}