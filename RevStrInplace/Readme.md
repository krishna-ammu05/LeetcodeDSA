# 344. Reverse String  

[LeetCode problem 344 – Reverse String](https://leetcode.com/problems/reverse-string/).

---

## 📝 Problem Statement  

Write a function that reverses a string.  
The input string is given as an array of characters `s`.  

You must do this by modifying the input array **in-place** with `O(1)` extra memory.  

### Example 1  
```
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
```

### Example 2  
```
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
```

### Constraints  
- `1 <= s.length <= 10^5`  
- `s[i]` is a printable ASCII character.  

---

## 💡 Approach  

We use the **two-pointer technique**:  
- Initialize two pointers, `left = 0` and `right = len(s) - 1`.  
- Swap `s[left]` and `s[right]` while moving the pointers inward.  
- Continue until `left >= right`.  

This ensures the reversal happens **in-place** with `O(1)` extra space.  

---

## 🚀 Solution  

### Python Example  
```python
from typing import List

def reverseString(s: List[str]) -> None:
    left, right = 0, len(s) - 1
    while left < right:
        s[left], s[right] = s[right], s[left]
        left += 1
        right -= 1
```
This modifies the array `s` directly without returning anything, as required.  

---

## 🧠 Complexity Analysis  

| Operation       | Time Complexity | Space Complexity |
|-----------------|-----------------|-----------------|
| Reversing Array | `O(n)`          | `O(1)`           |

Where `n` is the length of the array.  

---

## 📚 References  

- [LeetCode Problem Link](https://leetcode.com/problems/reverse-string/)  
- [In-place Algorithm (Wikipedia)](https://en.wikipedia.org/wiki/In-place_algorithm)
