class Solution {
    public int[] numberOfPairs(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int pairs=0;
        for(int i=0; i<nums.length; i++){
            if(list.contains(nums[i])){
                list.remove(Integer.valueOf(nums[i]));
                pairs++;
            }
            else{
                list.add(nums[i]);
            }
        }
        int[] ans=new int[2];
        ans[0]=pairs;
        ans[1]=list.size();
        return ans;
    }
}