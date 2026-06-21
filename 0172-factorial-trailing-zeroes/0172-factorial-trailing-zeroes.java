class Solution {
    public int trailingZeroes(int n) {
        int zero=0;
        while(n>=5){
            n=n/5;
            zero=zero+n;
        }
        return zero;
    }
}