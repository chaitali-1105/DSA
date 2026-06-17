class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length==0 ){
            return 0;
        }
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

        int n=points.length;
        pair[] mat=new pair[n];
        for(int i=0;i<n;i++){
   
            mat[i] = new pair(points[i][0], points[i][1]);
        }
        Arrays.sort(mat);

        int arrow=1;
        int prev=mat[0].end;
        for(int i=1;i<n;i++){
            if(mat[i].start>prev){
                arrow++;
                prev=mat[i].end;
            }
        }
    return arrow;
    }
}