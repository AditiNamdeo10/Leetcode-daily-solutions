// Problem : 3718. Smallest Missing Multiple of K

class Solution:
    def missingMultiple(self, nums: List[int], k: int) -> int:
        temp=k
        for i in range(len(nums)):
            if temp not in nums:
                return temp
            temp+=k
        return temp