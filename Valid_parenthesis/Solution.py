class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        bracket_map = {')': '(', '}': '{', ']': '['}

        for ch in s:
            if ch in bracket_map.values():  # opening brackets
                stack.append(ch)
            elif ch in bracket_map:  # closing brackets
                if not stack or stack.pop() != bracket_map[ch]:
                    return False
            else:
                return False  # invalid character (optional, based on constraint)

        return not stack  # stack must be empty if valid
