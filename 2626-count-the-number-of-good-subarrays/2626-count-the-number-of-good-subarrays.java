class Solution {
    public long countGood(int[] nums, int k) {
        // int n = nums.length;
        // long cnt = 0;
        // long cnt1 = 0;
        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         if (i < j && nums[i] == nums[j]) {
        //             cnt++;
        //             if (cnt >= k) {
        //                 cnt1++;
        //             }
        //         }
        //     }
        // }
        // return cnt1;
        int n = nums.length;
        long cnt = 0;  
        long pairs = 0; 
        int left = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < n; right++) {
            int val = nums[right];
            int freq = map.getOrDefault(val, 0);
            pairs += freq;
            map.put(val, freq + 1);

            while (pairs >= k) {
                cnt += n - right; 
                int leftVal = nums[left];
                int leftFreq = map.get(leftVal);
                pairs -= leftFreq - 1;
                map.put(leftVal, leftFreq - 1);
                left++;
            }
        }

        return cnt;
    }
}