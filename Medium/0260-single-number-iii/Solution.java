class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans=new int[2];
        int j=0;
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length){
            if(i==nums.length-1 || nums[i]!=nums[i+1]){
                ans[j]=nums[i];
                j++;
                i++;
            }
            else{
                i+=2;
            }
        }
        return ans;
    }
}