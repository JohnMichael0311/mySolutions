class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            int sum = 0, x = i;
            while (x > 0) {
                sum += x % 10;
                x /= 10;
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        int max = 0, count = 0;
        for (int v : map.values()) {
            if (v > max) {
                max = v;
                count = 1;
            } else if (v == max) {
                count++;
            }
        }
        return count;
    }
}