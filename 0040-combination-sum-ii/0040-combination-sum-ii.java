class Solution {
    public void solve(int i,int[] candidates,int target, List<List<Integer>> ans,List<Integer>curr){
             if(target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(i==candidates.length || target<0){
            return;
        }
   
        if(target>=candidates[i]){

            curr.add(candidates[i]);
            solve(i+1,candidates,target-candidates[i],ans,curr);
            curr.remove(curr.size()-1);
        }
        int idx=i+1;
        while(idx<candidates.length && candidates[idx]==candidates[idx-1]){
            idx++;
        }
        solve(idx,candidates,target,ans,curr);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList() ;
        solve(0,candidates,target,ans,new ArrayList<Integer>()) ;
        return ans ;
    }
}