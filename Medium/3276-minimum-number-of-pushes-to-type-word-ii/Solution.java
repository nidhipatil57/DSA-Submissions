class Solution {
    public int minimumPushes(String word) {
        int[] frequency=new int[26];
        for(int i=0; i<word.length(); i++){
            frequency[word.charAt(i)-'a']++;
        }
        Arrays.sort(frequency);
        int push=0;
        int count=0;
        for(int i=25; i>=0; i--){
            if(frequency[i]==0){
                break;
            }
            push=push+frequency[i]*((count/8)+1);
            count++;
        }
        return push;
    }
}