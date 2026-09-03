class Solution {
    public boolean uniformArray(int[] nums) {
        int Odd=Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++) 
        {
            if(nums[i]%2==1) 
            {
                Odd = Math.min(Odd, nums[i]);
            }
        }
        if(Odd==Integer.MAX_VALUE) 
        {
            return true;
        }
        for(int i=0; i<nums.length; i++) 
        {
            if(nums[i]%2==0 && nums[i]<Odd) 
            {
                return false;
            }
        }
        return true;
    }
}