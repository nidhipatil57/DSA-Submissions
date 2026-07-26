class Solution {
    public int minimumSum(int num) {
        int[] ans=new int[4];
        for(int i=3; i>=0; i--){
            ans[i]=num%10;
            num=num/10;
        }
        Arrays.sort(ans);
        int num1=ans[0]*10+ans[2];
        int num2=ans[1]*10+ans[3];
        return num1+num2;
    }
}