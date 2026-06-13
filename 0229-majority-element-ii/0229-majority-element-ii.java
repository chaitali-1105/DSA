class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cn1=0;
        int cn2=0;
        int el1=Integer.MIN_VALUE;
        int el2=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(cn1==0 && nums[i]!=el2){
                cn1=1;
                el1=nums[i];
            }
            else if(cn2==0 && nums[i]!=el1){
                cn2=1;
                el2=nums[i];
            }
            else if(nums[i]==el1) cn1++;
            else if(nums[i]==el2) cn2++;
            else{
                cn1--;
                cn2--;
            }
        }
        //verification
        cn1=0; cn2=0;
        for(int n:nums){
            if(n==el1)cn1++;
            if(n==el2)cn2++;
        }
        int mini=nums.length/3+1;
        List<Integer> ans=new ArrayList<>();

        if(cn1>=mini) ans.add(el1);
        if(cn2>=mini) ans.add(el2);

        return ans;

    }
}