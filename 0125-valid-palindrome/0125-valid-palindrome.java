class Solution {
    public boolean isPalindrome(String s) {
       StringBuilder str=new StringBuilder();
       for(char ch: s.toLowerCase().toCharArray()){
        if (Character.isLetterOrDigit(ch)){
            str.append(ch);
        }
       }
       int i=0;
       int j=str.length()-1;
       while(i<j){
        if(str.charAt(i)!=str.charAt(j)) return false;
        i++;
        j--;
       }
       return true;
    }
}