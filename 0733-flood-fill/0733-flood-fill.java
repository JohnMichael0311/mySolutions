class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // Queue<int []> q = new LinkedList<>();
        int[][] copy = image;
        int ini = image [sr][sc]; 
           
           
        
        //-------------------BFS------------------
        // while(!q.isEmpty()){
        //     int size = q.size();
        //     int[] point = q.poll();
        //     for(int i = 0; i<size; i++){
                
        //         for(int j = 0; j< 4;j++){
        //             int x = point[0] + dr[j];
        //             int y = point[1] + dr[j];
        //             if(x>n || y>m || int[x][y]!== int[sr][sc] ) continue;
        //             int[x][y] = color;
        //             q.add(new int[]{x, y});
        //         }
        //     }
        // }
        //---------------------------DFS---------------------------
        int[] dr = {0, -1, 0, 1};
        int[] dc = {-1, 0, 1, 0};
        dfs(copy , sr , sc, color, image , ini , dr, dc);
        return copy;
    }
    public void dfs(int[][] copy , int sr , int sc, int color ,int[][] image, int ini, int[] dr, int[] dc){
            copy[sr][sc]=color;
            int n = image.length;
            int m = image[0].length;
            
            
            for(int j = 0; j<4; j++){
                int x = sr + dr[j];
                int y = sc + dc[j];
                if(x>=0 && x<n && y>=0 && y<m && image[x][y]==ini && copy[x][y] != color){
                    dfs(copy, x, y, color, image, ini, dr, dc);
                }
                    
                
            }
            
        }


    }
