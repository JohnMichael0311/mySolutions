class Solution {
    public int findKthLargest(int[] nums, int k) {
        // PriorityQueue<task> q = new PriorityQueue<>(new Comparator<task>(){
        //     public int compare(task t1, task t2){
        //         return t2.priority - t1.priority;
        //     }
        // });
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = nums.length;
        for(int i = 0; i<n; i++){
            pq.add(nums[i]);
        }
        for(int i = 1; i<k;i++){
            pq.poll();
        }
        return pq.peek();
    }
}