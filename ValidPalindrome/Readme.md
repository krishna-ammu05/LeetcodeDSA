# 125. Valid Palindrome

## Problem
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward.  
Alphanumeric characters include **letters** and **numbers**.

Given a string `s`, return `true` if it is a palindrome, or `false` otherwise.

### Examples

#### Example 1:
**Input:**
```
s = "A man, a plan, a canal: Panama"
```
**Output:**
```
true
```
**Explanation:**  
After removing non-alphanumeric characters and converting to lowercase, we get `"amanaplanacanalpanama"`, which is a palindrome.

---

#### Example 2:
**Input:**
```
s = "race a car"
```
**Output:**
```
false
```
**Explanation:**  
After cleaning, we get `"raceacar"`, which is not a palindrome.

---

#### Example 3:
**Input:**
```
s = " "
```
**Output:**
```
true
```
**Explanation:**  
After removing non-alphanumeric characters, we get an empty string `""`, which is considered a palindrome.

---

## Constraints
- `1 <= s.length <= 2 * 10^5`
- `s` consists only of printable ASCII characters.

---

## Approach

### Method: Two-Pointer
1. Use two pointers: `left` starting from the beginning, `right` from the end.
2. Skip any non-alphanumeric characters using `isalnum()` (Python) or `Character.isLetterOrDigit()` (Java).
3. Compare characters in lowercase.
4. If any mismatch occurs → return `false`.
5. If all match → return `true`.

### Time Complexity:
- **O(n)** — Each character is checked at most once.

### Space Complexity:
- **O(1)** — No extra string storage is used.

---

## Alternate Python Solution (Cleaned String)
```python
class Solution:
    def isPalindrome(self, s: str) -> bool:
        cleaned = ''.join(ch.lower() for ch in s if ch.isalnum())
        return cleaned == cleaned[::-1]
```
- Easier to read, but uses **O(n)** extra space.
