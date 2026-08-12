class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int max=0;
        int left=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int j=0; j<nums.length; j++){
            map.put(nums[j], map.getOrDefault(nums[j],0)+1);
            while(map.get(nums[j])>k){
                map.put(nums[left], map.get(nums[left])-1);
                left++;
            }
            max=Math.max(max, j-left+1);
        }
        return max;
    }
}