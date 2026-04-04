class Solution {
    public void solve(int[]nums,List<Integer> curr,List<List<Integer>> ans){
        if(curr.size()==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(curr.contains(nums[i]) )continue;
            curr.add(nums[i]);
            solve(nums,curr,ans);
            curr.remove(curr.size()-1);

        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums,new ArrayList<>(),ans);
        return ans;
    }
}