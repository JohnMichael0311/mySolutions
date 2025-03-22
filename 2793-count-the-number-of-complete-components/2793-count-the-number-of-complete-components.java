class Solution {


    public int countCompleteComponents(int n, int[][] edges) {
        int a = edges.length;
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i<a; i++ ){
            int u = edges[i][0];
            int v = edges[i][1]; 
                
                adj.get(u).add(v);
                adj.get(v).add(u);
                
            
        }
        int[] vis= new int[n];
        int cnt = 0;
        for(int i = 0; i<n;i++){
            if(vis[i]==0){
                List<Integer> componentStore = new ArrayList<>();
                dfs(i ,adj, vis, componentStore );
                if (Complete(componentStore, adj)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void dfs( int node , ArrayList<ArrayList<Integer>> adj,  int[] vis, List<Integer> componentStore  ){
        vis[node] = 1;
        componentStore.add(node);
        for(int it : adj.get(node)){
            if(vis[it]==0){
            dfs(it, adj, vis, componentStore );
            }
        }
    }
    public static boolean Complete(List<Integer> componentStore, ArrayList<ArrayList<Integer>> adj ){
        int n = componentStore.size();
        for(int i = 0; i<n; i++){
            int node = componentStore.get(i);
            if(adj.get(node).size()!= n -1 ){
                return false;
            }
        }
        return true;

    }
}