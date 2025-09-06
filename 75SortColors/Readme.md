
# 🟦 LeetCode 75: Sort Colors

## 📌 Problem Statement
Given an array `nums` with `n` objects colored red, white, or blue, sort them **in-place** so that objects of the same color are adjacent, with the colors in the order **red, white, and blue**.

We will use the integers:
- `0` → Red  
- `1` → White  
- `2` → Blue  

You **must solve this problem without using** the library’s sort function.

---

## 🔗 Problem Link
[LeetCode 75 - Sort Colors](https://leetcode.com/problems/sort-colors/)

---

## ✨ Examples

### Example 1
**Input:**
```
nums = [2,0,2,1,1,0]
```
**Output:**
```
[0,0,1,1,2,2]
```

---

### Example 2
**Input:**
```
nums = [2,0,1]
```
**Output:**
```
[0,1,2]
```

---

## ⚡ Constraints
- `n == nums.length`  
- `1 <= n <= 300`  
- `nums[i]` is either `0`, `1`, or `2`

---

## 🎯 Approach

This is a classic **Dutch National Flag Problem**.  
We solve it using **three pointers**:

- `low`: boundary for `0`s  
- `mid`: current index  
- `high`: boundary for `2`s  

### Algorithm:
1. Initialize `low = 0`, `mid = 0`, `high = n - 1`.
2. Traverse the array while `mid <= high`:
   - If `nums[mid] == 0`: swap `nums[low]` and `nums[mid]`, then increment `low` and `mid`.
   - If `nums[mid] == 1`: just increment `mid`.
   - If `nums[mid] == 2`: swap `nums[mid]` and `nums[high]`, then decrement `high`.

This ensures:
- All `0`s move to the left
- All `2`s move to the right
- `1`s stay in the middle naturally

---

## ⏱️ Complexity Analysis
- **Time Complexity:** `O(n)` (single pass)  
- **Space Complexity:** `O(1)` (in-place)

---

## 💻 Code Implementation

### Python
```python
def sortColors(nums):
    low, mid, high = 0, 0, len(nums) - 1
    
    while mid <= high:
        if nums[mid] == 0:
            nums[low], nums[mid] = nums[mid], nums[low]
            low += 1
            mid += 1
        elif nums[mid] == 1:
            mid += 1
        else:  # nums[mid] == 2
            nums[mid], nums[high] = nums[high], nums[mid]
            high -= 1
```

---

### Java
```java
class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}
```

---

## ✅ Dry Run Example
Input: `[2, 0, 2, 1, 1, 0]`

| low | mid | high | Array State       |
|-----|-----|------|-------------------|
| 0   | 0   | 5    | [2, 0, 2, 1, 1, 0] |
| 0   | 0   | 4    | [0, 0, 2, 1, 1, 2] |
| 1   | 1   | 4    | [0, 0, 2, 1, 1, 2] |
| 2   | 2   | 4    | [0, 0, 2, 1, 1, 2] |
| 2   | 2   | 3    | [0, 0, 1, 1, 2, 2] |
| 2   | 3   | 3    | [0, 0, 1, 1, 2, 2] |
| 2   | 4   | 3    | [0, 0, 1, 1, 2, 2] |

Final Output → `[0, 0, 1, 1, 2, 2]`
