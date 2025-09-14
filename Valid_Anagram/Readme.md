# 242. Valid Anagram  

 [LeetCode problem 242 – Valid Anagram](https://leetcode.com/problems/valid-anagram/).

---

## 📝 Problem Statement  

Given two strings `s` and `t`, return **true** if `t` is an anagram of `s`, and **false** otherwise.  

An **anagram** is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.  

### Example 1  
```
Input: s = "anagram", t = "nagaram"  
Output: true  
```

### Example 2  
```
Input: s = "rat", t = "car"  
Output: false  
```

### Constraints  
- `1 <= s.length, t.length <= 5 * 10^4`  
- `s` and `t` consist of lowercase English letters.  

### Follow-up  
What if the inputs contain **Unicode characters**?  
> Instead of using fixed-size arrays for character counts, you can use a hash map (dictionary) to count occurrences of each character regardless of encoding.  

---

## 💡 Approach  

Two common approaches:  

1. **Sorting**  
   - Sort both strings and compare them.  
   - Time Complexity: `O(n log n)` (due to sorting).  
   - Space Complexity: `O(1)` (ignoring sorting overhead).  

2. **Hash Map / Frequency Count** (preferred)  
   - Count the frequency of each character in both strings.  
   - Compare the frequency maps.  
   - Time Complexity: `O(n)`  
   - Space Complexity: `O(1)` for lowercase English letters or `O(k)` for Unicode (where `k` = unique characters).  

---

## 🚀 Solution  

### Python Example  
```python
def isAnagram(s: str, t: str) -> bool:
    if len(s) != len(t):
        return False
    
    count_s = {}
    count_t = {}
    
    for ch in s:
        count_s[ch] = count_s.get(ch, 0) + 1
    for ch in t:
        count_t[ch] = count_t.get(ch, 0) + 1
    
    return count_s == count_t
```

### Unicode-Compatible Version  
```python
from collections import Counter

def isAnagram(s: str, t: str) -> bool:
    return Counter(s) == Counter(t)
```

---

## 🧠 Complexity Analysis  

| Approach          | Time Complexity | Space Complexity |
|-------------------|-----------------|-----------------|
| Sorting           | `O(n log n)`    | `O(1)`           |
| Hash Map/Counter  | `O(n)`          | `O(k)`           |

Where `n` is the length of the strings and `k` is the number of unique characters.  

---

## 📚 References  

- [LeetCode Problem Link](https://leetcode.com/problems/valid-anagram/)  
- [Anagram (Wikipedia)](https://en.wikipedia.org/wiki/Anagram)
