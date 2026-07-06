class Solution {
    public String reverseWords(String s) {
        StringBuilder rev=new StringBuilder(s);
        rev.reverse();
        StringBuilder ans=new StringBuilder();
        int i=0;
        while(i<rev.length()){
            StringBuilder word=new StringBuilder();
            while(i<rev.length() && rev.charAt(i)==' '){
                i++;
            }
            while(i<rev.length() && rev.charAt(i)!=' '){
                word.append(rev.charAt(i));
                i++;
            }
            if(word.length()>0){
                if(ans.length()>0){
                    ans.append(" ");
                }
                ans.append(word.reverse());
            }
        }
        return ans.toString();
    }
}