class Solution {
    public int numberOfSubstrings(String s) {
        int left=0;
        int right=0;
        int count=0;
        int[] freq=new int[3];
        int n= s.length();

        for(right=0;right<n;right++){
            freq[s.charAt(right)-'a']++;

            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
                count=count+(n-right);
                freq[s.charAt(left)-'a']--;
                left++;
            }

        }
        return count;
    }
}