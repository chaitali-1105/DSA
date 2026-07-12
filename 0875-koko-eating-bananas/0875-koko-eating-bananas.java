class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        int ans=-1;
        for(int banana:piles){
            high=Math.max(high,banana);
        }
        while(low<=high){
            int mid=low+(high-low)/2;

            if(isPossible(piles,h,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    private boolean isPossible(int[] piles, int h,int speed){
        long hours=0;
        for(int banana:piles){
            hours+=banana/speed;

            if(banana%speed!=0){
                hours++;
            }
        }
        return hours<=h;
    }
}