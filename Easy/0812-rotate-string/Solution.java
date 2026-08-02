class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
            return false;
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            String temp="";
            for(int j=i;j<arr.length;j++){
                temp+=arr[j];
            }
            for(int j=0;j<i;j++){
                temp+=arr[j];
            }
            if(temp.equals(goal))
                return true;
        }
        return false;
    }
}