class Solution {
    public boolean canAliceWin(int[] nums) {
        int singlesum=0;
        int doublesum=0;
        for(int i=0; i<nums.length; i++){
            int c=0;
            int n=nums[i];
            while(n>0){
                int d=n%10;
                c++;
                n=n/10;
            }
            if(c==2){
                doublesum=doublesum+nums[i];
            }
            else if(c==1){
                singlesum=singlesum+nums[i];
            }
        }
        if(doublesum>singlesum || singlesum>doublesum){
            return true;
        }
        return false;
    }
}