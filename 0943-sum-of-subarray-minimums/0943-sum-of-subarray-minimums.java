class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] PSE= PSE(arr, n);
        int[] NSE = NSE(arr, n);
        int total = 0;
        int mod = 1000000007;

        for(int i = 0; i<n; i++){
            int left = i - PSE[i];
            int right = NSE[i] - i;
            // total = (total+(int)(1L*right*left*arr[i])%mod)%mod;
            total = (total + (int) ((1L * right * left * arr[i]) % mod)) % mod;
        }
        return total;
    }
    public int[] NSE(int[] arr,  int n){
        int[] ans1 = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n-1; i>=0; i--){
        while(!st.isEmpty() && arr[st.peek()]>arr[i]){
            st.pop();
        } 
        if(st.isEmpty()) ans1[i] = n;
        else ans1[i] = st.peek();
        st.push(i);
        }
        return ans1;

    }

    public int[] PSE(int[] arr, int n){
        int[] ans2 = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<n; i++){
        while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
            st.pop();
        } 
        if(st.isEmpty()) ans2[i] = -1;
        else ans2[i] = st.peek();
        st.push(i);
        }
        return ans2;
        
    }
}