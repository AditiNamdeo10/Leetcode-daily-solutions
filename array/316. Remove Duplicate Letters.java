//Problem : 316. Remove Duplicate Letters
class Solution {
    public String removeDuplicateLetters(String s) {

        //Storing the index of last occurence of character
        int [] last=new int[26];
        for(int i=0;i<s.length();i++){
            last[s.charAt(i)-'a']=i;
        }

        boolean[] visited=new boolean[26];
        Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(visited[ch-'a']){
                continue;
            }
            while(!st.isEmpty()
            && ch<st.peek()
            && last[st.peek()-'a']>i){
                visited[st.peek()-'a']=false;
                st.pop();
            }

            //Add current character
            st.push(ch);
            visited[ch-'a']=true;
        }
        StringBuilder ans=new StringBuilder();
        for(char ch:st){
            ans.append(ch);
        }
        return ans.toString();
    }
}