# 392. Is Subsequence

## Problem Statement

Given two strings `s` and `t`, return `true` if `s` is a **subsequence** of `t`, or `false` otherwise.

A **subsequence** of a string is a new string that is formed from the original string by deleting some (can be none) of the characters **without disturbing the relative positions** of the remaining characters.

- Example: `"ace"` is a subsequence of `"abcde"`
- Example: `"aec"` is **not** a subsequence of `"abcde"`

---

## Examples

**Example 1:**

```
Input: s = "abc", t = "ahbgdc"
Output: true
```

**Example 2:**

```
Input: s = "axc", t = "ahbgdc"
Output: false
```

---

## Constraints

- `0 <= s.length <= 100`  
- `0 <= t.length <= 10^4`  
- `s` and `t` consist only of lowercase English letters.

---

## Approach / Solution

### 1. Two-pointer method (for a single query)

- Use two pointers:
  - `i` for `t` (target string)  
  - `j` for `s` (subsequence)
- Traverse `t`.  
- If `t[i] == s[j]`, increment `j`.  
- Always increment `i`.  
- At the end, if `j == len(s)`, then `s` is a subsequence.

**Time Complexity:** `O(|n|)`  
**Space Complexity:** `O(1)`

---

### 2. Follow-up: Multiple queries

If there are billions of `s` strings (`s1, s2, ..., sk`) to check against the same `t`:

1. **Preprocess `t`:**  
   - Store the indices of each character `'a'` to `'z'` in a lookup table.
2. **Binary search for each query `s`:**  
   - For each character in `s`, use binary search on its precomputed positions in `t` to find the next occurrence after the current position.
3. This reduces the per-query time to `O(|s| log |t|)`.

---



---

## References

- [LeetCode Problem 392: Is Subsequence](https://leetcode.com/problems/is-subsequence/)
- [Two-pointer technique](https://www.geeksforgeeks.org/two-pointers-technique/)

