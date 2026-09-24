class Solution {
    public int smallestIndex(int[] nums) {
        int min=Integer.MAX_VALUE;
        for (int i=0; i<nums.length; i++){
            int sum=0;
            int j=nums[i];
            while(j>0){
                int d=j%10;
                sum=sum+d;
                j=j/10;
            }
            if(i==sum){
                min=Math.min(min,i);
            }
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}