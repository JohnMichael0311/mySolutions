class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n = g.length;
        int m = s.length;
        int l = 0;
        int r =0;
        // int maxi=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(l<n && r<m){
            if(g[l]<=s[r]){
                l++;
                r++;
            }else{
                r++;
            }

            
            
            
        }
        return l;
    }
}