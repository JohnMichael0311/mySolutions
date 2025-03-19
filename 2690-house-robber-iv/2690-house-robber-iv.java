class Solution {
    public int minCapability(int[] nums, int k) {
        int n = nums.length;

        int low = Integer.MAX_VALUE;
        int high = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            low = Math.min(low, nums[i]);
            high = Math.max(high, nums[i]);
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (Rob(nums, k, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public boolean Rob(int[] nums, int k, int x) {
        int cnt = 0;
        int i = 0;

        while (i < nums.length) {
            if (nums[i] <= x) {
                cnt++;
                i++;
            }
            i++;
        }

        return cnt >= k;
    }
}