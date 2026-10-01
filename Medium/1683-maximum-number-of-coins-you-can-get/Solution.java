class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int sum=0;
        int i=piles.length-2;
        while(i>=piles.length/3){
            sum=sum+piles[i];
            i=i-2;
        }
        return sum;
    }
}