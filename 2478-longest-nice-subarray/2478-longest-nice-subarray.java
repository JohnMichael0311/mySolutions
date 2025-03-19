class Solution {
    public int longestNiceSubarray(int[] nums) {
         int left = 0, x = 0, maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            while ((x & nums[right]) != 0) {
                x ^= nums[left]; 
                left++;
            }
            x |= nums[right]; 
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}