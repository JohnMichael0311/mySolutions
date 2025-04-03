class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        // int l =0, r=0, maxlen =0;
        
        // while(r<n){
        //     char c = s.charAt(r);
            
        // }
        int[] lastseen = {-1,-1,-1};
        int cnt = 0;
        for(int i = 0; i<n; i++){
            char c = s.charAt(i);
            lastseen[c - 'a'] = i;
            if(lastseen[0]!=-1 && lastseen[1]!=-1&& lastseen[2]!=-1){
                cnt = cnt + (1 + Math.min(lastseen[0], Math.min(lastseen[1], lastseen[2])));
            }
        }
        return cnt;
    }
}