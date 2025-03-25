class Solution {
    public int trap(int[] height) {
        int n = height.length;
        // int cnt = 0;
        // for(int i = 0; i<n; i++){
        //     if(height[0]==0) cnt++;
        //     for(int j = i+1; j<n; j++){
        //         if(height[i] > height[j]) {
        //         cnt += Math.abs(height[i] - height[j]);
        //         break; 
        //         }
        //         else if(height[i]< height[j]) {
        //         cnt += Math.abs(height[j]-height[i]);
        //         break;
        //         }
        //     }
        // }
        // return cnt;
        
        // Lmax , rmax, min(lmax, rmax) - height[i]; approach
        // optimal 
        int lmax =0;
        int rmax =0;
        int total = 0;
        int l = 0;
        int r = n-1;
        while(l<r){
            if(height[l]<= height[r]){
            if(lmax>height[l]){
                total+=lmax - height[l];
            } else {
                lmax = height[l];
            }
            l++;
        } else {
            if(rmax> height[r]){
                total+=rmax - height[r];
            } else {
                rmax = height[r];
            }
            r--;
        }
        }
        return total;
    }
}