class Solution {
    public int shipWithinDays(int[] weights, int days) {
         int low=0;
        int high=0;
        int ans=-1;
        for(int weight:weights){
            low=Math.max(low,weight);
            high+=weight;
        }
        while(low<=high){
            int mid=low+(high-low)/2;

            if(isPossible(weights,days,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    private boolean isPossible(int[] weights,int days,int capacity){
        int daysreq=1;
        int load=0;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>capacity){
                daysreq+=1;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        if(daysreq<=days){
            return true;
        }
        return false;
    }
}