class Solution {
    public boolean isSameAfterReversals(int num) {
        int original=num;
        int reversednum=0;
        while(num>0){
            int digit=num%10;
            reversednum=reversednum*10+digit;
            num=num/10;
        }
        int reverseAgain=0;
        while(reversednum>0){
            int digit=reversednum%10;
            reverseAgain=reverseAgain*10+digit;
            reversednum=reversednum/10;
        }
        return original==reverseAgain;
    }
}