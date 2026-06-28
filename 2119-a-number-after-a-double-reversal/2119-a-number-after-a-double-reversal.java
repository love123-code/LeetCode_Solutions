class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev1 = 0;
        int org = num;
        int rev = 0;

        while(num!=0){
            int digit = num%10;
            rev1 = rev1*10 + digit;
            num/=10;
        }
         while(rev1!=0){
            int digit = rev1%10;
            rev = rev*10 + digit;
            rev1/=10;
        }
       
        if(rev == org){
            return true;
        }

        return false;
    }
}