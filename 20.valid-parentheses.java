/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start

class Solution {
    public boolean isValid(String s) {
        char[] list = new char[s.length()];
        int topIndex = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                list[++topIndex] = c;
            } else {
                if (topIndex == -1)
                    return false;

                char opened = list[topIndex--];
                if ((c == ')' && opened != '(') ||
                        (c == '}' && opened != '{') ||
                        (c == ']' && opened != '[')) {
                    return false;
                }
            }

        }
        return topIndex == -1;
    }
}
// @lc code=end
