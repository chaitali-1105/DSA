class Solution {
    public int myAtoi(String s) {
        if(s.length()==0) return 0;
        int i=0;

        while(i<s.length() && s.charAt(i)==' '){
         i++;
        }
         if(i==s.length()) return 0;
         int sign=1;
         long ans=0;
     

         if( s.charAt(i)=='-'){
            sign=-1;
         }
          if( s.charAt(i)=='-' || s.charAt(i)=='+'){
            i++;
          }

          while(i<s.length()){
            if(!Character.isDigit(s.charAt(i))){
                break;
            }
            ans=ans*10+(s.charAt(i)-'0');

            // Overflow check
            if (sign == 1 && ans > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;

            if (sign == -1 && -ans < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            i++;
          }
          return (int)(sign*ans);
    }
}