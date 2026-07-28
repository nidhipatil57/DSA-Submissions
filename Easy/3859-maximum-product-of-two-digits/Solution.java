class Solution {
    public int maxProduct(int n) {
        int[] arr = new int[10];
        int i=0;
        while(n>0){
            arr[i]=n%10;
            n=n/10;
            i++;
        }
        int max=0;
        for(int j=0; j<i-1; j++){
            for(int k=j+1; k<i; k++){
                max=Math.max(max, arr[j]*arr[k]);
            }
        }
        return max;
    }
}