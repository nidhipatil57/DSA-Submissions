class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length-1;
        int max=1;
        for(int i=1; i<=nums[0]; i++){
            if(nums[0]%i==0 && nums[l]%i==0){
                max=i;
            }
        }
        return max;
    }
}