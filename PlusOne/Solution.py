from typing import List

class Solution:
    @staticmethod
    def plusOne(digits: List[int]) -> List[int]:
        for i in range(len(digits) - 1, -1, -1):
            if digits[i] < 9:
                digits[i] += 1
                return digits
            digits[i] = 0
        
        # If all digits were 9, we need an extra digit at the front
        new_number = [0] * (len(digits) + 1)
        new_number[0] = 1
        return new_number
