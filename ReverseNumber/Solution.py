class Solution:
    def reverse(self, n: int) -> int:
        if n is None:  # handle missing input
            return 0
        
        INT_MAX = 2**31 - 1
        INT_MIN = -2**31
        
        sum = 0
        sign = 1 if n >= 0 else -1
        n = abs(n)
        
        while n != 0:
            rem = n % 10
            n = n // 10
            
            # Overflow check
            if sum > INT_MAX // 10 or (sum == INT_MAX // 10 and rem > 7):
                return 0
            
            sum = sum * 10 + rem
        
        return sign * sum
