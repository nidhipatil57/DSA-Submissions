class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(!ans.contains(nums1[i])){
                if(contains(nums2,nums1[i]) || contains(nums3,nums1[i])){
                    ans.add(nums1[i]);
                }
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(!ans.contains(nums2[i])){
                if(contains(nums3,nums2[i])){
                    ans.add(nums2[i]);
                }
            }
        }

        return ans;
    }
    public boolean contains(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return true;
            }
        }
        return false;
    }
}