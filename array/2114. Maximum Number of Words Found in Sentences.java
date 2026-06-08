// Problem : 2114. Maximum Number of Words Found in Sentences

class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=Integer.MIN_VALUE;;
        int curr=0;
        for(String sentence:sentences){
            curr=1;
            for(int i=0; i<sentence.length(); i++){
                if(sentence.charAt(i)==' '){
                    curr+=1;
                }
            }
            if(max<curr){
                max=curr;
            }
        
        }
        return max;
    }
}