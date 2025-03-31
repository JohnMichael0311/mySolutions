class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxlen = 0;
        // for(int i = 0; i<n; i++){
        //     HashMap<Character , Integer> mpp = new HashMap<>();
            
            
        //     for(int j =i ; j<n; j++){
        //         char c = s.charAt(j);
        //         if(mpp.containsKey(c)) {
        //             break;
                    
        //         }
        //         mpp.put(c, 1);
        //         int len = j-i+1;
        //         maxlen = Math.max(len, maxlen);
        //     }
            
        // }
        // return maxlen;
        int[] hash = new int[256];
        for(int i = 0; i< hash.length; i++){
            hash[i] = -1;
        }
        int l = 0;
        int r = 0;
        while(r < n){
            char c = s.charAt(r);
            if(hash[c]!=-1){
                 if(hash[c]>=l){
                    l = hash[c] +1;
                 } 

            }
            int len = r - l +1;
            maxlen = Math.max(len , maxlen);
            hash[c] = r;
            r++;
        }
    return maxlen;
    }
}