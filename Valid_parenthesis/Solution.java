import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        // Traverse each character in the input string
        for (char ch : s.toCharArray()) {
            // If it's an opening bracket, push expected closing bracket
            if (ch == '(') {
                stack.push(')');
            } else if (ch == '{') {
                stack.push('}');
            } else if (ch == '[') {
                stack.push(']');
            } else {
                // If it's a closing bracket
                if (stack.isEmpty() || stack.pop() != ch) {
                    return false;
                }
            }
        }

        // If stack is empty, all brackets matched
        return stack.isEmpty();
    }
}
