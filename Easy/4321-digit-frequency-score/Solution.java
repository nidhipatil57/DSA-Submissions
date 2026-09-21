class Solution {
    public int digitFrequencyScore(int n) {
        int[] freq=new int[10];
        int num=n;
        while(num>0){
            int d=num%10;
            freq[d]++;
            num=num/10;
        }
        int sum=0;
        for(int i=0; i<=9; i++){
            sum=sum+(i*freq[i]);
        }
        return sum;
    }
}