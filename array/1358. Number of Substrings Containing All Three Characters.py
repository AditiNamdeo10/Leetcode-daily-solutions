#Problem : 1358. Number of Substrings Containing All Three Characters

class Solution:
    def numberOfSubstrings(self, s: str) -> int:
        left=0
        ans=0
        cnt={'a':0, 'b':0, 'c':0}
        for right in range(len(s)):
            cnt[s[right]]+=1

            while(cnt['a'] and cnt['b'] and cnt['c']):
                ans+=len(s)-right
                cnt[s[left]]-=1
                left+=1
        return ans
