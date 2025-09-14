class Solution:
    def containsDuplicate(self, arr: List[int]) -> bool:
        arr.sort()
        for i in range(0,len(arr)-1):
            if arr[i] == arr[i+1]:
                return True
        return False