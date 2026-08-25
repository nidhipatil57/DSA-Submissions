class Solution {
    public int missingMultiple(int[] nums,int k) {
        int num=k;
        while(true){
            boolean found=false;
            for(int j=0; j<nums.length; j++){
                if(nums[j]==num){
                    found=true;
                    break;
                }
            }
            if(!found)
                return num;
            num=num+k;
        }
    }
}