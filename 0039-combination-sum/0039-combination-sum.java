class Solution {
    public void solve(int i,int[] candidates,int target, List<List<Integer>> ans,List<Integer>curr){
        if(i==candidates.length || target<0){
            return;
        }
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(target>=candidates[i]){

            curr.add(candidates[i]);
            solve(i,candidates,target-candidates[i],ans,curr);
            curr.remove(curr.size()-1);
        }
        solve(i+1,candidates,target,ans,curr);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList() ;
        solve(0,candidates,target,ans,new ArrayList<Integer>()) ;
        return ans ;
    }
}