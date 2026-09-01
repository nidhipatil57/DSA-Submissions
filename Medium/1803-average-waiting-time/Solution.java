class Solution {
    public double averageWaitingTime(int[][] customers) {
        long time=0;
        long total=0;
        for(int i=0; i<customers.length; i++) {
            int arrival=customers[i][0];
            int cooking=customers[i][1];
            time=Math.max(time, arrival);
            time+=cooking;
            total+=time-arrival;
        }
        return (double) total/customers.length;
    }
}