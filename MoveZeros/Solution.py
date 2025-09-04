from typing import List

class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        count = 0  # position to insert non-zero elements
        
        # Step 1: shift non-zero elements to the front
        for i in range(n):
            if nums[i] != 0:
                nums[count] = nums[i]
                count += 1
        
        # Step 2: fill the rest with zeros
        while count < n:
            nums[count] = 0
            count += 1
