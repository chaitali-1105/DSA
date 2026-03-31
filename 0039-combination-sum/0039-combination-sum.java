class Solution {
    public void solve(int i,int[] arr, int target,List<List<Integer>>ans,List<Integer>curr) {
    
     if(i==arr.length){
        return;
    }
     if(target==0){
        ans.add(new ArrayList<>(curr));
        return;
     }
     if(target>=arr[i]){
        curr.add(arr[i]);
        solve(i,arr,target-arr[i],ans,curr);
        curr.remove(curr.size()-1);
     }
        solve(i+1,arr,target,ans,curr);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
     List<List<Integer>>ans=new ArrayList();
     solve(0,candidates,target,ans,new ArrayList<Integer>());
     return ans;
    }
}