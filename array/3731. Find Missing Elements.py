# Problem : 3731. Find Missing Elements

class Solution:
    def findMissingElements(self, nums: List[int]) -> List[int]:
        minele=min(nums)
        maxele=max(nums)
        ans=[]
        for i in range(minele,maxele):
            if i not in nums:
                ans.append(i)
        return ans



        # nums.sort()
        # ans=[]
        # for i in range(nums[0],nums[-1]):
        #     if i not in nums:
        #         ans.append(i)
        # return ans



        