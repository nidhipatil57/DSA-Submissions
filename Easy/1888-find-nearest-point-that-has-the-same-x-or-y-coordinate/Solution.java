class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min=Integer.MAX_VALUE;
        int distance;
        int ans=-1;
        for(int i=0; i<points.length; i++){
                if(points[i][0]==x || points[i][1]==y){
                    distance=Math.abs(points[i][0]-x)+Math.abs(points[i][1]-y);
                    if(distance<min){
                    min=distance;
                    ans=i;
                    }
                }
            }
        return ans;
    }
}