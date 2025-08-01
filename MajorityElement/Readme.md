# 169.  Majority Element

##  Problem Statement

Given an array `nums` of size `n`, return the majority element.

The **majority element** is the element that appears more than ⌊n / 2⌋ times.

You may assume that the majority element **always exists** in the array.

---

##  Examples

### Example 1:
```
Input: nums = [3, 2, 3]  
Output: 3
```

### Example 2:
```
Input: nums = [2, 2, 1, 1, 1, 2, 2]  
Output: 2
```

---

##  Constraints

- `n == nums.length`
- `1 <= n <= 5 * 10⁴`
- `-10⁹ <= nums[i] <= 10⁹`

---

##  Approach: Boyer-Moore Voting Algorithm

This efficient algorithm finds the majority element in `O(n)` time and `O(1)` space by canceling out non-majority elements.



##  Why It Works

The algorithm works by maintaining a candidate and adjusting its count. If the candidate's count drops to 0, we choose a new one. Since the majority element appears more than `n/2` times, it will remain as the final candidate.

---

##  Complexity

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

---

##  Additional Notes

- You are guaranteed that a majority element exists, so no need to verify the final result.
- This is a classic algorithm used in real-time processing due to its space efficiency.

---