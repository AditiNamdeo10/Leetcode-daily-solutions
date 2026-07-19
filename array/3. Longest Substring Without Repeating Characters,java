//Problem : 3. Longest Substring Without Repeating Characters
//Sliding Window

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxnum=0;
        int left=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int right=0; right<s.length();right++){
            char ch=s.charAt(right);
            if(map.containsKey(ch) && map.get(ch)>=left){
                left=map.get(ch)+1;
            }
            map.put(ch,right);
            maxnum=Math.max(maxnum,right-left+1);
        }
        return maxnum;
    }
}