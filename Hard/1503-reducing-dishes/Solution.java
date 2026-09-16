class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int ans=0;
        for(int i=0; i<satisfaction.length; i++){
            int time=1;
            int sum=0;
            for(int j=i; j<satisfaction.length; j++){
                sum=sum+satisfaction[j]*time;
                time++;
            }
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}