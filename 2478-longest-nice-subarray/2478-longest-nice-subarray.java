class Solution {
    public int longestNiceSubarray(int[] nums) {
         int left = 0, orMask = 0, maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            while ((orMask & nums[right]) != 0) {
                orMask ^= nums[left]; // Remove leftmost element
                left++;
            }
            orMask |= nums[right]; // Add the new element
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}