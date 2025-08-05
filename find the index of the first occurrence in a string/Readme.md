
#  28. Find the Index of the First Occurrence in a String

## 🧾 Problem Statement

Given two strings `needle` and `haystack`, return the **index of the first occurrence** of `needle` in `haystack`, or `-1` if `needle` is **not part of** `haystack`.

---

## 📥 Input

- `haystack`: A string where we are searching.
- `needle`: A substring to search for.

---

## 📤 Output

- An integer indicating the **starting index** of the first occurrence of `needle` in `haystack`.
- If `needle` is not found, return `-1`.

---

## 🔒 Constraints

- `1 <= haystack.length, needle.length <= 10⁴`
- Both `haystack` and `needle` consist of only **lowercase English letters** (`a-z`).

---

## 🧪 Examples

### Example 1
```text
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6. The first occurrence is at index 0.
```

### Example 2
```text
Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode".
```

---


## 💡 Notes

- This is a **brute-force solution** with a time complexity of **O(n × m)**.
- More efficient solutions exist using algorithms like **KMP (Knuth-Morris-Pratt)** for large inputs.

---

## 🏷️ Tags

`String` `Two Pointers` `Substring` `Brute Force` `KMP`
