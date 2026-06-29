class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
       class pair implements Comparable<pair>{
            int start;
            int end;

            pair(int start,int end){
                this.start=start;
                this.end=end;
            }
            @Override 
            public int compareTo(pair other){
                return Integer.compare(this.end,other.end);
                 }
        } 
       int n=intervals.length;
       pair[]  mat= new pair[n];
       for(int i=0;i<n;i++){
            mat[i]=new pair(intervals[i][0],intervals[i][1]);
       }
       Arrays.sort(mat);
        int remove=0;
        int prevend=mat[0].end;
         for (int i = 1; i < n; i++) {

            if (mat[i].start < prevend) {
                remove++;
            } else {
                prevend = mat[i].end;
            }
        }
    return remove;
    }
}