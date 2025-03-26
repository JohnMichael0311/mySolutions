class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i<n; i++){
            char c = num.charAt(i);
            while(!st.isEmpty() && k>0 && c < st.peek()){
                st.pop();
                k = k-1;
            }
            st.push(c);
        
        }
        while(k>0 && !st.isEmpty()) {
                st.pop();
                k--;
            }
        

        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }
         
        ans.reverse();
        while (ans.length() > 0 && ans.charAt(0) == '0') {
            ans.deleteCharAt(0);
        }
        
      return ans.length() == 0 ? "0" : ans.toString();
    }
}