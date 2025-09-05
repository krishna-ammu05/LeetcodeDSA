class Solution:
    def findMaxConsecutiveOnes(self, arr: List[int]) -> int:
        maxCount =0
        count =0
        for i in range(len(arr)):
            if arr[i]==1:
                count+=1
                maxCount = max(count,maxCount)
            else:
                count =0
        return maxCount