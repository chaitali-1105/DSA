class Solution {
    public void solve(int i,int[] nums,   List<List<Integer>> ans, List<Integer> curr){
        if(i==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        solve(i+1,nums,ans,curr);
        curr.remove(curr.size()-1);
        int idx=i+1;
        while(idx<nums.length && nums[idx]==nums[idx-1]){
            idx++;
        }
        solve(idx,nums,ans,curr);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList();
        solve(0,nums,ans,new ArrayList<Integer>());
        return ans;
    }
}