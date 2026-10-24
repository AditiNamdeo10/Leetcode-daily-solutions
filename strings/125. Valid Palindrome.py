class Solution:
    def isPalindrome(self, s: str) -> bool:
        snew=''
        s=s.lower()
        for ch in s:
            if ch.isalnum():
                snew+=ch
            
        i=0
        j=len(snew)-1
        while i<=j:
            if snew[i]!=snew[j] :
                return False
            i+=1
            j-=1
        
        return True
