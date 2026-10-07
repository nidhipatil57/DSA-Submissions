class Solution {
    public int totalMoney(int n) {
        int money=1;
        int sum=0;
        for(int i=0; i<n; i++){
            sum=sum+money;
            money++;
            if((i+1)%7==0){
                money=money-6;
            }
        }
        return sum;
    }
}