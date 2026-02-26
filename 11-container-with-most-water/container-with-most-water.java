class Solution {
    public int maxArea(int[] height) {
        int j = height.length;
        int i=0;
        int ans=Integer.MIN_VALUE;
        int n =j-1;

        while(i<n){
            int width=n-i;
            int area=Math.min(height[i],height[n])*width;
            ans=Math.max(ans,area);
            if(height[i]>height[n]){
                n--;
            }
            else{
                i++;
            }
        }
        return ans;
        
    }
}