class Solution {
    public int[] sumZero(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        int left=-1;
        int right=1;
        int i=0;
        if(n%2==1){
            list.add(0);
            i++;
        }
        while(i<n){
            list.add(left);
            list.add(right);
            i=i+2;
            left--;
            right++;
        }
        int[] ans=new int[n];
        for(int j=0; j<n; j++){
            ans[j]=list.get(j);
        }
        return ans;
    }
}