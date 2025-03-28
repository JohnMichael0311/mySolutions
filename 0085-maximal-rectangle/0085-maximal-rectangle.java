class Solution {
    public int maximalRectangle(char[][] matrix) {
       int n = matrix.length;
        if (n == 0) return 0;
        int m = matrix[0].length;
        
        int[][] prefixSum = new int[n][m];
        int max = 0;

        // Constructing the histogram heights from the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0, sum = 0; j < m; j++) {
                if (matrix[i][j] == '1') {
                    sum += 1;
                } else {
                    sum = 0;
                }
                prefixSum[i][j] = sum;
            }
        }

        // Apply Largest Rectangle in Histogram for each row
        for (int col = 0; col < m; col++) {
            int[] heights = new int[n];
            for (int row = 0; row < n; row++) {
                heights[row] = prefixSum[row][col];
            }
            max = Math.max(max, largestRectangleArea(heights));
        }
        return max;
    }
    public int largestRectangleArea(int[] heights ){
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
            int h = (i == n) ? 0 : heights[i];
            while (!st.isEmpty() && heights[st.peek()] > h) {
                int height = heights[st.pop()];
                int width = (st.isEmpty()) ? i : i - st.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            st.push(i);
        }
        return maxArea;
    }
}