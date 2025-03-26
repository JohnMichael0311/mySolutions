class Solution {
    public int minOperations(int[][] grid, int x) {
        int n = grid.length;
        int m = grid[0].length;
        
        for(int i = 0; i<n; i++ ){
            for(int j = 0; j<m;j++){
                int rem = grid[0][0]%x;
                if(grid[i][j]%x != rem){
                    return -1;
                }
            }
        }
        return calMinOp(grid, x);
    }
    public int calMinOp(int[][] grid, int x){
        int n = grid.length;
        int m = grid[0].length;
        int cnt = 0;
        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                values.add(grid[i][j]);
            }
        }
        Collections.sort(values);
        int mid = values.get(values.size() / 2); 
        for (int i =0; i<values.size(); i++) {
            cnt += Math.abs(values.get(i) - mid) / x;  
        }
        return cnt;
    }
}