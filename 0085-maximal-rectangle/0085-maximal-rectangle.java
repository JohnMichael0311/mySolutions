class Solution {
    public int maximalRectangle(char[][] matrix) {
       int n = matrix.length;
        if (n == 0) return 0;
        int m = matrix[0].length;
        
        int[][] prefixSum = new int[n][m];
        int max = 0;
        int sum = 0;
        
        
        for(int i = 0; i<n; i++){
            sum = 0;
            for(int j = 0; j<m; j++){
                if(matrix[i][j]== '1') sum +=1;
                else sum = 0;
                prefixSum[i][j] = sum;

            }
        }

        
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
        int maxi = 0;
        int ele = 0;
        int nse =0;
        int pse = 0;
        for(int i = 0; i<n; i++){

            
            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                ele = heights[st.pop()];
                nse = i;

                if(st.isEmpty()){
                pse = -1;
            } else {
                pse = st.peek();
            }
             maxi = Math.max((ele*(nse - pse - 1)), maxi);
            }
            
            
           
            st.push(i);
            
        }

        while (!st.isEmpty()) {
            ele = heights[st.pop()];
            nse = n;  
            
            if (st.isEmpty()) {
                pse = -1;
            } else {
                pse = st.peek();
            }

            maxi = Math.max(ele * (nse - pse - 1), maxi);
        }
        return maxi;
    }
}