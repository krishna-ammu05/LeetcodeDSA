# 141. Linked List Cycle

## Problem Statement

Given `head`, the head of a linked list, determine if the linked list has a **cycle** in it.

A cycle exists if there is some node in the list that can be reached again by continuously following the `next` pointer.
Internally, `pos` is used to denote the index of the node that the tail's `next` pointer is connected to. Note that `pos` is **not** passed as a parameter.

Return `true` if there is a cycle in the linked list, otherwise return `false`.

---

## Examples

**Example 1:**

```
Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
```

**Example 2:**

```
Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
```

**Example 3:**

```
Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.
```

---

## Constraints

- The number of nodes in the list is in the range `[0, 10^4]`.  
- `-10^5 <= Node.val <= 10^5`  
- `pos` is `-1` or a valid index in the linked-list.  

---

## Approach / Solution

### 1. Floyd’s Tortoise and Hare (Two-pointer) Method

- Use two pointers:
  - `slow` moves one step at a time  
  - `fast` moves two steps at a time
- Traverse the list:
  - If `slow` and `fast` meet at some node, a cycle exists → return `true`
  - If `fast` reaches `null`, there is no cycle → return `false`

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)` (constant memory)

---

### 2. Alternative Approach (Hash Set)

- Traverse the linked list and store each visited node in a `HashSet`.
- If a node is revisited, there is a cycle.
- Otherwise, reach the end → no cycle.

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(n)`  

> Note: This does not satisfy the **O(1) memory** follow-up.

---


## References

- [LeetCode Problem 141: Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/)  
- [Floyd’s Tortoise and Hare Algorithm](https://en.wikipedia.org/wiki/Cycle_detection#Floyd's_Tortoise_and_Hare)

