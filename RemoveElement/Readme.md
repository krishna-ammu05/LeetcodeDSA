
# 27. Remove Element 

**Given:**
- An integer array `nums`.
- An integer `val`.

**Task:**
Remove all occurrences of `val` in `nums` **in-place**. The **order** of elements may be changed. Return the **number `k`** of elements that are **not equal to `val`**.

###  Requirements:
- Modify `nums` such that the **first `k` elements** do **not equal `val`**.
- It **doesn't matter** what values are left beyond the first `k` elements.
- **Return `k`**, the count of non-`val` elements.

---

###  Custom Judge:

The judge tests your solution like this:

```java
int[] nums = [...];        // Input array
int val = ...;             // Value to remove
int[] expectedNums = [...]; // Expected answer

int k = removeElement(nums, val); // Call your implementation

assert k == expectedNums.length;

sort(nums, 0, k);          // Sort the first k elements
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
```

---

###  Example 1:

```
Input: nums = [3,2,2,3], val = 3  
Output: 2, nums = [2,2,_,_]
```

- Your function should return `k = 2`, with the first two elements of `nums` being `2`.
- The remaining elements are ignored (`_`).

---

###  Example 2:

```
Input: nums = [0,1,2,2,3,0,4,2], val = 2  
Output: 5, nums = [0,1,4,0,3,_,_,_]
```

- Your function should return `k = 5`.
- Any **5 elements not equal to 2** can appear in the first `k` indices.

---

###  Approach:

- Use **two pointers**:
  - `i` to iterate through the array.
  - `k` to track the position of the next non-`val` element.
- When `nums[i] != val`, copy `nums[i]` to `nums[k]` and increment `k`.


---

###  Example Test:

```python
nums = [0,1,2,2,3,0,4,2]
val = 2

sol = Solution()
k = sol.removeElement(nums, val)

print("k =", k)            # Output: 5
print("Modified nums =", nums[:k])  # Output: First 5 non-2 values (any order)
```

---

###  Constraints:

- `0 <= nums.length <= 100`
- `0 <= nums[i] <= 50`
- `0 <= val <= 100`
