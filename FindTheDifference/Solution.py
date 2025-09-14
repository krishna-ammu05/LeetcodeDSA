class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        result =0
        for i in range(0,len(s)):
            result=result^ord(s[i])
        for j in range(0,len(t)):
            result=result^ord(t[j])
        return chr(result)
