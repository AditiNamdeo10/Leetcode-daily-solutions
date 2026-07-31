//Problem : 3016. Minimum Number of Pushes to Type Word II

class Solution {
    public int minimumPushes(String word) {
        int[] freq=new int[26];
        for(char ch : word.toCharArray()){
            freq[ch-'a']++;
        }
        Arrays.sort(freq);
        int ans=0;
        int n=0;
        for(int i=25;i>=0;i--){
            ans+=(freq[i]*((n++/8)+1));
        }
        return ans;
    }
}