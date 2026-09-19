class Solution {
    public int mirrorDistance(int n) {
        int num=n;
        int reverse=0;
        while(num>0){
            int d=num%10;
            reverse=(reverse*10)+d;
            num=num/10;
        }
        return Math.abs(n-reverse);
    }
}