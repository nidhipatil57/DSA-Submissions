class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<asteroids.length; i++){
            list.add(asteroids[i]);
        }
        int i=0;
        while(i<list.size()-1){
            if(list.get(i)>0 && list.get(i+1)>0){
                i++;
            }
            else if(list.get(i)>0 && list.get(i+1)<0){
                if(Math.abs(list.get(i+1))<list.get(i)){
                    list.remove(i+1);
                }
                else if(Math.abs(list.get(i+1))>list.get(i)){
                    list.remove(i);
                    if(i>0){
                        i--;
                    }
                }
                else{
                    list.remove(i+1);
                    list.remove(i);
                    if(i>0){
                        i--;
                    }
                }
            }
            else{
                i++;
            }
        }

        int[] ans=new int[list.size()];
        for(int j=0; j<list.size(); j++){
            ans[j]=list.get(j);
        }
        return ans;
    }
}