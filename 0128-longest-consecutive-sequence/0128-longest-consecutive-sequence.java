class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        int longest=1;
        if(n==0) return 0;
        for(int num:nums){
            set.add(num);
        }

        for(int num:set){
            if(!set.contains(num-1)){
                int count=1;
                int curr=num;
            
            while(set.contains(curr+1)){
                count+=1;
                curr+=1;
            }
                        longest=Math.max(longest,count);
            }

        }
    return longest;
    }
}