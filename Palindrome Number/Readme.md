# 9. Palindrome Number

## Description

Given an integer `x`, return `True` if `x` is a palindrome, and `False` otherwise.

A **palindrome** is a number that reads the same **forward and backward**.

---

## Examples

### Example 1
- **Input:** `x = 121`
- **Output:** `true`
- **Explanation:** 121 reads the same from left to right and right to left.

### Example 2
- **Input:** `x = -121`
- **Output:** `false`
- **Explanation:** It reads -121 from left to right but 121- from right to left.

### Example 3
- **Input:** `x = 10`
- **Output:** `false`
- **Explanation:** Reads 01 from right to left. Therefore not a palindrome.

---

## Constraints

- `-2^31 <= x <= 2^31 - 1`

---

## Follow-Up

**Can you solve it without converting the integer to a string?** ✅

Yes. Below is a Python solution that uses mathematical operations only:


---

## ✅ Time and Space Complexity

- **Time Complexity:** O(log₁₀(n)) — we process half the digits
- **Space Complexity:** O(1) — no extra space used