class Solution {

    public List<Integer> generaterow(int row){
        long ans=1;
        List<Integer> ansrow=new ArrayList<>();
        ansrow.add(1);

        for(int i=1 ;i<row;i++){
            ans=ans*(row-i);
            ans=ans/i;
            ansrow.add((int)ans);
        }
        return ansrow;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=1;i<=numRows;i++){
            ans.add(generaterow(i));
        }
        return ans;
    }
}