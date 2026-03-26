class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        solve(0,n-1,s);
    }
    public void solve(int i,int j,char[] arr){
        if(i>=j){
            return;
        }
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        solve(i+1,j-1,arr);
    }
}