class Solution {
    public String finalString(String s) {
        String ans="";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!='i'){
                ans=ans+s.charAt(i);
            }
            else{
                String temp="";
                for(int j=ans.length()-1; j>=0; j--){
                    temp=temp+ans.charAt(j);

                }
                ans=temp;
            }
        }
        return ans;
    }
}