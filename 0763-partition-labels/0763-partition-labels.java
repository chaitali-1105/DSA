class Solution {
    public List<Integer> partitionLabels(String s) {
    int[]last=new int[26];
    ArrayList<Integer> partition=new ArrayList<>();

    for(int i=0;i<s.length();i++){
        last[s.charAt(i)-'a']=i;
    }
    for(int i=0;i<s.length();){
    int start=i;
    int end=last[s.charAt(i)-'a'];
    for(int j=start+1;j<end;j++){
        int currlast=last[s.charAt(j)-'a'];
    
    if(currlast>end){
        end=currlast;
    }
    }
    partition.add(end-start+1);
    i=end+1;
    }
    return partition;
    }
}