class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        n = len(haystack)
        m = len(needle)

        if m == 0:
            return 0  # Empty needle appears at index 0

        for i in range(n - m + 1):  # loop from 0 to n - m
            if haystack[i:i+m] == needle:
                return i  # found the match
        return -1  # not found
