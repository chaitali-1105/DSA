class Solution {
     public int binarysearch(int start,int end,int[]nums,int target){
       if(start > end){
         return -1;
        }
        int mid=start+(end-start)/2;
        if(nums[mid]==target){
                return mid;
        }
        else if(nums[mid]<target){
                return binarysearch(mid+1,end,nums,target);
         }
        else{
                return binarysearch(start,mid-1,nums,target);
        }
    }

    public int search(int[] nums, int target) {
    int start = 0;
    int end = nums.length - 1;
    return binarysearch( start, end,nums, target);
    }
}
