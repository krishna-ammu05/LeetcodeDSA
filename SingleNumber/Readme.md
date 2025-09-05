# 136. Single Number

**Link:** [LeetCode Problem](https://leetcode.com/problems/single-number/)

## Problem Statement

Given a non-empty array of integers `nums`, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

### Example 1
```
Input: nums = [2,2,1]
Output: 1
```

### Example 2
```
Input: nums = [4,1,2,1,2]
Output: 4
```

### Example 3
```
Input: nums = [1]
Output: 1
```

### Constraints
- 1 <= nums.length <= 3 * 10⁴  
- -3 * 10⁴ <= nums[i] <= 3 * 10⁴  
- Each element in the array appears twice except for one element which appears only once.

---

## Approach

We need to find the element that appears only once while all others appear twice.

Key observation:
- XOR has special properties:
  - `a ^ a = 0`
  - `a ^ 0 = a`
  - XOR is commutative and associative.

So, if we XOR all numbers in the array:
- Pairs cancel out (because `x ^ x = 0`).
- The result is the single number that appears once.

---

## Solution Code (Java)

```java
class Solution {
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }
}
```

---

## Solution Code (Python)

```python
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        single = 0
        for num in nums:
            single ^= num
        return single
```

---

## Time & Space Complexity

- **Time Complexity:** O(n) → iterate once through the array  
- **Space Complexity:** O(1) → only one variable used
