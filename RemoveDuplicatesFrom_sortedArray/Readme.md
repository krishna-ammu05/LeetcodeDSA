
# 26. Remove Duplicates from Sorted Array

##  Problem Statement

Given an integer array `nums` **sorted in non-decreasing order**, remove the **duplicates in-place** such that each unique element appears **only once**, and return the number of unique elements `k`.

The first `k` elements of `nums` should contain the unique elements in the same order they appeared in. The remaining elements of `nums` beyond `k` are not important.

Your implementation must modify the array in-place and use **O(1) extra memory**.

---

##  Constraints

- `1 <= nums.length <= 3 * 10⁴`
- `-100 <= nums[i] <= 100`
- `nums` is sorted in **non-decreasing** order

---

##  Approach

This problem is efficiently solved using the **two-pointer technique**:

- `i` tracks the position of the **last unique element**.
- `j` scans the array from left to right.
- If `nums[j] != nums[i]`, it's a **new unique element**, so we:
  - Increment `i`
  - Write `nums[j]` to `nums[i]`

---

##  Algorithm Steps

1. Initialize `i = 0` (first element is always unique).
2. Traverse from `j = 1` to `n - 1`.
3. If `nums[j] != nums[i]`:
   - Increment `i`
   - Set `nums[i] = nums[j]`
4. Return `i + 1` as the count of unique elements.

---

##  Example 1

**Input:**
```
nums = [1, 1, 2]
```

**Output:**
```
k = 2, nums = [1, 2, _]
```

---

##  Example 2

**Input:**
```
nums = [0,0,1,1,1,2,2,3,3,4]
```

**Output:**
```
k = 5, nums = [0,1,2,3,4,_,_,_,_,_]
```

---

##  Test Case Verification (Custom Judge)

```java
int[] nums = [...]; // input array
int[] expectedNums = [...]; // expected array with unique elements only

int k = removeDuplicates(nums);

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
```

---

##  Output

- Returns `k` (the number of unique elements).
- The first `k` elements of `nums` contain the unique values.
- The remaining elements do not matter.

---

##  Time & Space Complexity

- **Time Complexity:** O(n) — single pass through the array
- **Space Complexity:** O(1) — in-place, no extra space used

---

##  Tags

- Array
- Two Pointers
- In-place
