// Problem : 3014. Minimum Number of Pushes to Type Word I

class Solution {
    public int minimumPushes(String word) {
        int ans=0;
        for(int i=0;i<word.length();i++){
            ans+=(i/8)+1;
        }
        return ans;
    }
}