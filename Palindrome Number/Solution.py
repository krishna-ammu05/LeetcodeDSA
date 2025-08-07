class Solution:
    def isPalindrome(self, x: int) -> bool:
        # Step 1: Negative numbers or numbers ending with 0 (but not 0 itself) are not palindromes
        if x < 0 or (x % 10 == 0 and x != 0):
            return False

        reversed_num = 0

        # Step 2: Reverse only half of the number
        while x > reversed_num:
            rem = x % 10                   # get last digit
            reversed_num = reversed_num * 10 + rem
            x = x // 10                    # remove last digit

        # Step 3: Check if number is palindrome
        return x == reversed_num or x == reversed_num // 10
