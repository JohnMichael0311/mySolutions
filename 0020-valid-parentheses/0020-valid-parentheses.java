class Solution {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack<>();
        int n = s.length();
        for(int i = 0 ; i<n; i++){
            char a = s.charAt(i);
            if(a == '(' || a== '[' || a == '{') st.push(a);
            if(st.isEmpty()) return false;
            else {
                if(a == ')' || a == ']' || a == '}') {
                char b = st.pop();
                if(a==')' && b != '(' || a==']' && b!='[' || a=='}' && b!='{')  return false;
                }
            }
        }
        return st.isEmpty();
    }
}