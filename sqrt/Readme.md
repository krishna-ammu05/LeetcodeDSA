# 69. Integer Square Root

## Problem Statement
Given a non-negative integer `x`, return the **square root of `x` rounded down** to the nearest integer.  
The returned integer should also be non-negative.  

**Restrictions:**  
- You **cannot** use any built-in exponent function or operator.  
  - For example, do **not** use `pow(x, 0.5)` in C++ or `x ** 0.5` in Python.

---

## Examples

**Example 1**  
```
Input: x = 4
Output: 2
Explanation: The square root of 4 is 2.
```

**Example 2**  
```
Input: x = 8
Output: 2
Explanation: The square root of 8 is approximately 2.82842, rounded down to 2.
```

---

## Constraints
- `0 <= x <= 2^31 - 1`  

---

## Approach

### 1. Binary Search Method (Recommended)
- Initialize `low = 0` and `high = x`.  
- While `low <= high`:
  - Calculate `mid = low + (high - low) / 2`.  
  - If `mid * mid == x`, return `mid`.  
  - If `mid * mid < x`, move right → `low = mid + 1`.  
  - Else move left → `high = mid - 1`.  
- When the loop ends, `high` will be the integer square root of `x`.

**Time Complexity:** `O(log x)`  
**Space Complexity:** `O(1)`

---

### 2. Brute Force (Less Efficient)
- Start from `i = 0`, increment `i` until `i*i > x`.  
- Return `i-1` as the result.

**Time Complexity:** `O(√x)`  

---

### 3. Newton’s Method (Optional, Advanced)
- Iteratively approximate square root using:  
```
guess = (guess + x / guess) / 2
```
- Converges quickly and works for large `x`.  

---


## Sample Input / Output

| Input | Output | Explanation |
|-------|--------|-------------|
| 4     | 2      | √4 = 2     |
| 8     | 2      | √8 ≈ 2.828 → floor 2 |
| 0     | 0      | √0 = 0     |
| 1     | 1      | √1 = 1     |
| 10    | 3      | √10 ≈ 3.162 → floor 3 |

---

