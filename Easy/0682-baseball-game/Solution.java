class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> list=new ArrayList<>();
        int sum=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int size=list.size();
                list.add(list.get(size-1)+list.get(size-2));
            }
            else if(operations[i].equals("D")){
                list.add(2*list.get(list.size()-1));
            }
            else if(operations[i].equals("C")){
                list.remove(list.size()-1);
            }
            else{
                list.add(Integer.parseInt(operations[i]));
            }
        }
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        return sum;
    }
}