class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n=0;
        int[] ans=new int[2];
            for(int i=0; i<nums.length; i++){
                int c=0;
                for(int j=0; j<nums.length; j++){
                    if(nums[i]==nums[j]){
                        c++;
                    }
                }
                if(c==2){
                boolean found = false;
                for(int j=0; j<n; j++){
                    if(ans[j]==nums[i]){
                        found=true;
                    }
                }
                if(!found){
                    ans[n]=nums[i];
                    n++;
                }
            }
        }
        return ans;
    }
}