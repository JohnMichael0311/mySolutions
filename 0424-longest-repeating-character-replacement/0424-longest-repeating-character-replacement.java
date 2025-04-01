class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        // for(int i =0; i<n; i++){
        //     for(int j = 0; j<n; j++){
                
        //     }
        // }
        int r =0, l =0, maxlen = 0, maxfreq = 0;
        int[] hash = new int[26];
        while(r<n){
            char c = s.charAt(r);
            hash[c - 'A']++;
            maxfreq = Math.max(maxfreq, hash[c-'A']);
            if((r - l +1)-maxfreq > k){
                hash[s.charAt(l) - 'A']--;
                l=l+1;
            }
            
                maxlen = Math.max(maxlen , r - l +1);

            
            r++;
        }
        return maxlen;
    }
}