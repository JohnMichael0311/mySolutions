class Solution {
    public int largestRectangleArea(int[] heights) {
        //brute nse, pse and area = arr[i] *(nse - pse -1)
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