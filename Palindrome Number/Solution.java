class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x); // Convert number to string
        int left = 0;
        int right = str.length() - 1;

        // Compare characters from both ends
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Mismatch means not a palindrome
            }
            left++;
            right--;
        }

        return true; // All characters matched
    }
}
