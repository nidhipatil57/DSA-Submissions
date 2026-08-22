class Solution {
    public boolean checkDivisibility(int n) {
        int dsum=0;
        int dprod=1;
        int sum;
        int num=n;
        while(num>0){
            int digit=num%10;
            dsum=dsum+digit;
            dprod=dprod*digit;
            num=num/10;
        }
        sum=dsum+dprod;
        return n%sum==0;
    }
}