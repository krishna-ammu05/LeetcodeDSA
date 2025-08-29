# 7. Reverse Integer

## Problem Statement
Given a signed 32-bit integer `x`, return `x` with its digits reversed.  
If reversing `x` causes the value to go outside the signed 32-bit integer range `[-2^31, 2^31 - 1]`, then return `0`.

[LeetCode Problem Link](https://leetcode.com/problems/reverse-integer/)


**Note:**
- Assume the environment does not allow storing 64-bit integers (signed or unsigned).

---

## Examples

**Example 1**
```
Input: x = 123
Output: 321
```

**Example 2**
```
Input: x = -123
Output: -321
```

**Example 3**
```
Input: x = 120
Output: 21
```

---

## Constraints
- `-2^31 <= x <= 2^31 - 1`

---

## Approach

### Step-by-Step Logic

1. Initialize `result = 0`.
2. Extract digits from `x` one by one using `x % 10`.
3. Before appending the digit to `result`, check for potential overflow:
   - If `result > INT_MAX/10` or `result < INT_MIN/10`, return `0`.
4. Update `result = result * 10 + digit`.
5. Remove the last digit from `x` using `x = x / 10`.
6. Repeat until `x` becomes 0.
7. Return `result`.

**Time Complexity:** `O(log10(x))`  
**Space Complexity:** `O(1)`

---

## Java Implementation

```java
public static int reverse(int x) {
    int result = 0;
    while (x != 0) {
        int digit = x % 10;
        x = x / 10;
        
        // Check for overflow
        if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && digit > 7)) return 0;
        if (result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE/10 && digit < -8)) return 0;
        
        result = result * 10 + digit;
    }
    return result;
}
```

---

## Sample Input / Output

| Input  | Output | Explanation |
|--------|--------|-------------|
| 123    | 321    | Reverse digits |
| -123   | -321   | Reverse digits, keep negative sign |
| 120    | 21     | Leading zeros removed |
| 0      | 0      | Edge case |
| 1534236469 | 0  | Overflow → return 0 |

---



