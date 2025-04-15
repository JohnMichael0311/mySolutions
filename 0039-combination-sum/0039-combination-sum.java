class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // int n = candidates.length;
        // List<List<Integer>> ls = new ArrayList<>();

        // for(int i = 0; i<n; i++){
        //     int sum = 0;
        //     List<Integer> ans = new ArrayList<>();
        //     int j = i;

        //         while(sum<target){
        //             if(j>=n) break;
        //             if(sum+candidates[j]<=target){
        //             sum+=candidates[j];
        //         ans.add(candidates[j]);
        //             }else {
        //             j++;
        //         }
        //         }
        //     if(sum==target){
        //     ls.add(ans);
        //     }
        // }
        // return ls;

        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, 0, target, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int start, int target, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            current.add(candidates[i]);
            backtrack(candidates, i, target - candidates[i], current, result);
            current.remove(current.size() - 1);
        }
    }
}