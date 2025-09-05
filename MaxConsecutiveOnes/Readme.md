# 485. Max Consecutive Ones

**Link:** [LeetCode Problem](https://leetcode.com/problems/max-consecutive-ones/)

## Problem Statement

Given a binary array `nums`, return the maximum number of consecutive `1`s in the array.

### Example 1
```
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
```

### Example 2
```
Input: nums = [1,0,1,1,0,1]
Output: 2
```

### Constraints
- 1 <= nums.length <= 10⁵  
- nums[i] is either `0` or `1`

---

## Approach

We need to count the longest streak of consecutive `1`s:

1. Initialize two variables:
   - `count` → to keep track of the current streak of 1s.
   - `maxCount` → to store the maximum streak so far.
2. Loop through the array:
   - If the current element is `1`, increase `count`.
   - If the current element is `0`, reset `count` to 0.
   - Update `maxCount` at each step.
3. Return `maxCount`.

---

## Solution Code (Java)

```java
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }

        return maxCount;
    }
}
```

---

## Solution Code (Python)

```python
class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        count = 0
        max_count = 0

        for num in nums:
            if num == 1:
                count += 1
                max_count = max(max_count, count)
            else:
                count = 0

        return max_count
```

---

## Time & Space Complexity

- **Time Complexity:** O(n) → iterate once through the array  
- **Space Complexity:** O(1) → only two variables used
