class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start=0;
        int n=gas.length;
        int totalgas=0;
        int currgas=0;

        for(int i=0;i<n;i++){
            int gain=gas[i]-cost[i];
            totalgas+=gain;
            currgas+=gain;

            if(currgas<0){
                start=i+1;
                currgas=0;
            }
        }
    return totalgas>=0 ? start :-1;
    }
}