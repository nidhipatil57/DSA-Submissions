class Solution {
    public int longestSubsequence(int[] nums) {
        int xor=0;
        for(int i=0; i<nums.length; i++){
            xor=xor^nums[i];
        }
        if(xor!=0){
            return nums.length;
        }
        int c=0;
        if(xor==0){
            for(int i=0; i<nums.length; i++){
                if(nums[i]==0){
                    c++;
                }
            }
            if(c==nums.length){
                return 0;
            }
        }
        return nums.length-1;
    }
}