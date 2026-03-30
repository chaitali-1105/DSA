class Solution {
    public void merge(int[]nums,int low,int mid,int high){
        int left=low;
        int right=mid+1;
        int[] arr=new int[high-low+1];
        int index=0;

        while(left<=mid && right<=high){
            if(nums[left]<nums[right]){
                arr[index++]=nums[left++];
            }
            else{
                 arr[index++]=nums[right++];
            }
        }
        while(left<=mid){
            arr[index++]=nums[left++];
        }
        while(right<=high){
            arr[index++]=nums[right++];
        }
        for(int i=0;i<arr.length;i++){
            nums[low+i]=arr[i];
        }
    }
    public void mergesort(int[]nums,int low,int high){
        if(low>=high){
            return;
        }
        int mid=low+(high-low)/2;
        mergesort(nums,low,mid);
        mergesort(nums,mid+1,high);
        merge(nums,low,mid,high);
    }
    public int[] sortArray(int[] nums) {
        int low=0;
        int high=nums.length-1;
        mergesort(nums,low,high);
        return nums;
    }
    
}