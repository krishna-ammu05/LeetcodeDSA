
# 11. Container With Most Water 

## Problem Statement

You are given an integer array `height` of length `n`. There are `n` vertical lines drawn such that the two endpoints of the ith line are `(i, 0)` and `(i, height[i])`.

Find two lines that, together with the x-axis, form a container such that the container contains the **most water**.

Return the **maximum amount of water** a container can store.

>  **Note:** You may **not slant the container**.

---

## Examples

### Example 1:

```
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation:
Lines at index 1 (height = 8) and index 8 (height = 7) form the container with:
- Width = 8 - 1 = 7
- Height = min(8, 7) = 7
- Area = 7 * 7 = 49
```

### Example 2:

```
Input: height = [1,1]
Output: 1
Explanation:
Only two lines, width = 1, height = min(1,1) = 1 → Area = 1
```

---

## Constraints

- `n == height.length`
- `2 <= n <= 10^5`
- `0 <= height[i] <= 10^4`

---

## Approach 

###  Two Pointer Technique (Efficient - O(n) Time Complexity)

- Use two pointers: one at the beginning (`left`), one at the end (`right`) of the array.
- Compute the area between `height[left]` and `height[right]`.
- Move the pointer with the **shorter line**, as it is the limiting factor for water height.
- Repeat until `left < right`.

###  Formula:
```
Area = min(height[left], height[right]) * (right - left)
```
---

## Time and Space Complexity

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

---

## Tags

`#TwoPointers` `#Greedy` `#Array` `#WaterStorage` `#SlidingWindow`
