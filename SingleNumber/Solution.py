class Solution:
    def singleNumber(self, arr: List[int]) -> int:
        singleNumber =0
        for i in range(len(arr)):
            singleNumber^=arr[i]
        return singleNumber