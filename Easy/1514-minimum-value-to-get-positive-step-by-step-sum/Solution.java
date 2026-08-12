class Solution {
    public int minStartValue(int[] nums) {
        int start=1;
        while(true){
            int sum=start;
            boolean result=true;
        for(int i=0; i<nums.length; i++){
            sum=sum+nums[i];
            if(sum<1){
                result=false;
                break;
            }
        }
        if(result==true){
            return start;
        }
        start++;
        }
    }
}