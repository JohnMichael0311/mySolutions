class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map <Integer, Integer> map = new HashMap<>();
       int n = nums.length;
      
       for(int i = 0; i<n; i++){
         int first = nums[i];
         int second = target - nums[i];
         if(map.containsKey(second)){
            return new int[]{ map.get(second),i};
         }
         map.put(first, i);


       }
       return new int []{-1,1};
    
    }
}
