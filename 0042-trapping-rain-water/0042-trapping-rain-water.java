class Solution {
    public int trap(int[] height) {
      int i=0;
      int n=height.length;
      int j=n-1;
      int ans=0;
      int leftmax=0;
      int rightmax=0;
      while(i<j){
        if(height[i]>leftmax){
            leftmax=height[i];
        }
        if(height[j]>rightmax){
            rightmax=height[j];
        }
        if(leftmax>rightmax){
            ans+=rightmax-height[j];
            j--;

        }
        else{
            ans+=leftmax-height[i];
            i++;
        }
      }
      return ans;
    }
}