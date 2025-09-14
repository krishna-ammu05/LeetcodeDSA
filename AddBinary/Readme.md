# 67. Add Binary

🔗 [LeetCode Problem Link](https://leetcode.com/problems/add-binary)

---

## 📘 Problem Description

Given two binary strings `a` and `b`, return their **sum** as a binary string.

---

## 📝 Examples

### Example 1:
**Input:**
```
a = "11"
b = "1"
```

**Output:**
```
"100"
```

### Example 2:
**Input:**
```
a = "1010"
b = "1011"
```

**Output:**
```
"10101"
```

---

## 🔒 Constraints
- `1 <= a.length, b.length <= 10^4`
- `a` and `b` consist only of `'0'` or `'1'` characters.
- Each string does not contain leading zeros except for the zero itself.

---

## 💡 Approach

We can perform **binary addition** manually using two pointers from right to left:

1. Initialize two pointers at the end of `a` and `b`.
2. Keep a `carry` variable.
3. Add the digits from right to left along with `carry`.
4. Append the result digit to a `StringBuilder` or list.
5. Reverse at the end to get the final binary sum.

⏱️ **Time Complexity:** O(max(a.length, b.length))  
💾 **Space Complexity:** O(max(a.length, b.length))

---

## 🚀 Solutions

### ✅ Java Solution
```java
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';

            sb.append(sum % 2);
            carry = sum / 2;
        }

        return sb.reverse().toString();
    }
}
```

---

### ✅ Python Solution
```python
class Solution:
    def addBinary(self, a: str, b: str) -> str:
        i, j = len(a) - 1, len(b) - 1
        carry = 0
        result = []

        while i >= 0 or j >= 0 or carry:
            sum_val = carry
            if i >= 0:
                sum_val += int(a[i])
                i -= 1
            if j >= 0:
                sum_val += int(b[j])
                j -= 1

            result.append(str(sum_val % 2))
            carry = sum_val // 2

        return ''.join(reversed(result))
```

---

## 🎯 Key Takeaway
Manual binary addition is essential for handling large binary strings that cannot fit into integer types.  
Using two pointers and a carry is the most straightforward approach.

---
