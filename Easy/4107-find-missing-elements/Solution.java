class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> missing=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        for(int j=min+1; j<max; j++){
            boolean found=false;
            for(int i=0; i<nums.length; i++){
                if(nums[i]==j){
                    found=true;
                    break;
                }
            }
            if(found==false)
            missing.add(j);
        }
        return missing;
    }
}