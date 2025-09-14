# 217. Contains Duplicate  

[LeetCode problem 217 – Contains Duplicate](https://leetcode.com/problems/contains-duplicate/).

---

## 📝 Problem Statement  

Given an integer array `nums`, return **true** if any value appears **at least twice** in the array, and return **false** if every element is distinct.  

### Example 1  
```
Input: nums = [1,2,3,1]
Output: true
Explanation: The element 1 occurs at the indices 0 and 3.
```

### Example 2  
```
Input: nums = [1,2,3,4]
Output: false
Explanation: All elements are distinct.
```

### Example 3  
```
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
```

### Constraints  
- `1 <= nums.length <= 10^5`  
- `-10^9 <= nums[i] <= 10^9`  

---

## 💡 Approach  

We can use a **Hash Set** to keep track of the elements seen so far:  
- Iterate through `nums`.  
- If the current number is already in the set, return `True`.  
- Otherwise, add it to the set.  
- Return `False` if no duplicates are found after the loop.  

This solution runs in `O(n)` time with `O(n)` extra space.  

---

## 🚀 Solution  

### Python Example  
```python
from typing import List

def containsDuplicate(nums: List[int]) -> bool:
    seen = set()
    for num in nums:
        if num in seen:
            return True
        seen.add(num)
    return False
```

Alternatively, a one-liner using Python sets:  
```python
def containsDuplicate(nums: List[int]) -> bool:
    return len(nums) != len(set(nums))
```

---

## 🧠 Complexity Analysis  

| Operation        | Time Complexity | Space Complexity |
|-----------------|-----------------|-----------------|
| Checking Duplicates | `O(n)`          | `O(n)`           |

Where `n` is the length of the array.  

---

## 📚 References  

- [LeetCode Problem Link](https://leetcode.com/problems/contains-duplicate/)  
- [Hash Set (Python docs)](https://docs.python.org/3/library/stdtypes.html#set-types-set-frozenset)
