class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int totalsets = 1<<n;
        for (int i = 0; i < totalsets; i++) {
            int xor = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    xor = xor ^ nums[j];
                }
            }
            sum += xor;
        }
        

        return sum;
    }
}