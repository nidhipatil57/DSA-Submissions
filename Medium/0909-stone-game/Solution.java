class Solution {
    public boolean stoneGame(int[] piles) {
        Arrays.sort(piles);
        int alice=0;
        int bob=0;
        for(int i=piles.length-1; i>=0; i-=2){
            alice=alice+piles[i];
        }
        for(int i=piles.length-2; i>=0; i-=2){
            bob=bob+piles[i];
        }
        if(alice>bob){
        return true;
        }
        return false;
    }
}