class Solution:
    def missingNumber(self, arr: List[int]) -> int:
        n =len(arr)
        total = n*(n+1)//2
        curr_sum =0
        for num in arr:
            curr_sum+=num
        return total - curr_sum