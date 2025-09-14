# 345. Reverse Vowels of a String

🔗 [LeetCode Problem Link](https://leetcode.com/problems/reverse-vowels-of-a-string)

---

## 📘 Problem Description

Given a string `s`, reverse **only** all the vowels in the string and return it.

The vowels are `'a', 'e', 'i', 'o', 'u'`, and they can appear in both **lowercase** and **uppercase**, more than once.

---

## 📝 Examples

### Example 1:
**Input:**
```
s = "IceCreAm"
```

**Output:**
```
"AceCreIm"
```

**Explanation:**
The vowels in `s` are `['I', 'e', 'e', 'A']`.  
On reversing the vowels, `s` becomes `"AceCreIm"`.

---

### Example 2:
**Input:**
```
s = "leetcode"
```

**Output:**
```
"leotcede"
```

---

## 🔒 Constraints
- `1 <= s.length <= 3 * 10^5`
- `s` consists of printable ASCII characters.

---

## 💡 Approach

We use the **two-pointer technique**:

1. Define a set of vowels (`aeiouAEIOU`).
2. Convert the string into a character array for in-place modification.
3. Use two pointers:
   - `i` starts from the beginning.
   - `j` starts from the end.
4. Move `i` forward until it points to a vowel.
5. Move `j` backward until it points to a vowel.
6. Swap the vowels at positions `i` and `j`.
7. Continue until `i >= j`.
8. Return the modified string.

⏱️ **Time Complexity:** `O(n)`  
💾 **Space Complexity:** `O(n)` (for character array)

---

## 🚀 Solutions

### ✅ Java Solution
```java
class Solution {
    public String reverseVowels(String s) {
        if (s == null || s.length() == 0) return s;

        String vowels = "aeiouAEIOU";
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;

        while (i < j) {
            while (i < j && vowels.indexOf(arr[i]) == -1) i++;
            while (i < j && vowels.indexOf(arr[j]) == -1) j--;

            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        return new String(arr);
    }
}
```

---

### ✅ Python Solution
```python
class Solution:
    def reverseVowels(self, s: str) -> str:
        vowels = "aeiouAEIOU"
        arr = list(s)
        i, j = 0, len(arr) - 1

        while i < j:
            while i < j and arr[i] not in vowels:
                i += 1
            while i < j and arr[j] not in vowels:
                j -= 1

            arr[i], arr[j] = arr[j], arr[i]
            i += 1
            j -= 1

        return "".join(arr)
```

---

## 🎯 Key Takeaway
This is a classic **two-pointer string manipulation** problem.  
Efficient handling of characters using `ord/chr` is unnecessary here since we only care about vowel checking and swapping.

---
