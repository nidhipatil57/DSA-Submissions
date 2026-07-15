class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=0;
        int sumEven=0;
        int c=0;
        int odd=1;
        int even=2;
        while(c<n){
            sumOdd=sumOdd+odd;
            sumEven=sumEven+even;
            odd=odd+2;
            even=even+2;
            c++;
    }
    int d=1;
    int gcd;
    int max=Integer.MIN_VALUE;
    while(d<=sumEven && d<=sumOdd){
    if(sumOdd%d==0 && sumEven%d==0){
        gcd=d;
        max=Math.max(max, gcd);
    }
    d++;
    }
    return max;

    }
}