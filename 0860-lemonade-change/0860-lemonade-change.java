class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        int twenty=0;

        for(int num:bills){
            if(num==5){
                five++;
            }
            else if(num==10){
                if(five>=1){
                    five--;
                    ten++;
                }
                else{
                    return false;
                }
                
                
            }
            else if(num==20){
                 if(five>=1 && ten>=1){
                    five--;
                    ten--;
                }
                else if(five>=3){
                    five=five-3;
                }
                else{
                    return false;
                }
            }
           
        }
        return true;
    }
}