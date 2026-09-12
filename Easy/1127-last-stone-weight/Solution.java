class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<stones.length; i++){
            list.add(stones[i]);
        }
        while(list.size()>1){
            int i=list.size()-1;
            if(list.get(i)==list.get(i-1)){
                list.remove(i);
                list.remove(i-1);
            }
            else{
                int num=list.get(i)-list.get(i-1);
                list.remove(i);
                list.remove(i-1);
                list.add(num);
            }
            Collections.sort(list);
        }
        if(list.size()==1){
            return list.get(0);
        }
        return 0;
    }
}