class Solution {
    public int leastInterval(char[] tasks, int n) {
        int a = tasks.length;
        int cnt = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int[] freq = new int[26];
        for(int i =0; i<a; i++){
            freq[tasks[i] - 'A']++;
        }
        for(int j = 0; j<freq.length; j++){
            if(freq[j]>0){
                q.add(freq[j]);
            }
        }
        int time = 0;
        while(!q.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int c = n +1;
            while(c>0 && !q.isEmpty()){
                int curr = q.poll();
                if(curr>1){
                    temp.add(curr - 1);
                }
                time++;
                c--;
            }
            for(int i = 0; i<temp.size(); i++){
                q.add(temp.get(i));
            }
            if(q.isEmpty()) break;
            time+=c;
        }
        return time;
        
        
    }
}