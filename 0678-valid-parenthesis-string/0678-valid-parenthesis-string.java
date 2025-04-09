class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        int maxi = 0;
        int mini = 0;
        for(int i = 0; i<n; i++){
            char c = s.charAt(i);
            if(c == '(') {
                mini = mini +1;
                maxi = maxi +1;
            } 
            else if(c == ')'){
                mini = mini -1;
                maxi = maxi -1;
            } 
            else {
                mini = mini -1;
                maxi = maxi +1;
            }
            if(mini < 0) mini = 0;
            if(maxi< 0) return false;
        }
        if(mini == 0) return true ;
        return false;
    }
}