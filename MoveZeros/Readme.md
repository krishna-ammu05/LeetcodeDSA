# LeetCode 283. Move Zeroes

## Problem Statement
Given an integer array `nums`, move all `0`s to the end of it while maintaining the relative order of the non-zero elements.

**Note:** You must do this in-place without making a copy of the array.

### Example 1:
**Input:**  
nums = [0,1,0,3,12]  
**Output:**  
[1,3,12,0,0]  

### Example 2:
**Input:**  
nums = [0]  
**Output:**  
[0]  

---

## Constraints
- 1 <= nums.length <= 10⁴  
- -2³¹ <= nums[i] <= 2³¹ - 1  

---

## Approach
We use a **two-pointer technique**:
1. Use one pointer (`insertPos`) to track where the next non-zero element should go.
2. Traverse the array:
   - If the current element is non-zero, place it at `nums[insertPos]` and move `insertPos` forward.
3. After processing all non-zeros, fill the rest of the array with `0`s.

This ensures:
- Non-zero elements keep their relative order.
- All zeros are moved to the end.
- The operation is done **in-place** with O(1) extra space.

---

## Python Solution

```python
from typing import List

class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        # pointer for placement of non-zero elements
        insertPos = 0  

        # Step 1: Move non-zero elements forward
        for num in nums:
            if num != 0:
                nums[insertPos] = num
                insertPos += 1

        # Step 2: Fill remaining positions with 0
        while insertPos < len(nums):
            nums[insertPos] = 0
            insertPos += 1
```

---

## Complexity Analysis
- **Time Complexity:** O(n) (one pass to move non-zeros, one pass to insert zeros)  
- **Space Complexity:** O(1) (in-place)  

---

## Alternative Swap-Based Solution

Instead of overwriting then filling, we can **swap non-zeros forward**:

```python
class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        lastNonZero = 0
        for i in range(len(nums)):
            if nums[i] != 0:
                nums[lastNonZero], nums[i] = nums[i], nums[lastNonZero]
                lastNonZero += 1
```

This approach moves elements in one pass and avoids the second loop.
