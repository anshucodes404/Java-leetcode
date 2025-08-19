/*
 * @lc app=leetcode id=682 lang=java
 *
 * [682] Baseball Game
 */

// @lc code=start
class Solution {
    public int calPoints(String[] operations) {
        int size = operations.length;
        int[] scores = new int[size];
        int top = -1;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (operations[i].equals("+")) {
                scores[++top] = scores[top - 1] + scores[top - 2];
                sum += scores[top];
            } else if (operations[i].equals("C")) {
                sum -= scores[top];
                top--;
            } else if (operations[i].equals("D")) {
                scores[++top] = 2 * scores[top - 1];
                sum += scores[top];
            } else {
                scores[++top] = Integer.valueOf(operations[i]);
                sum += scores[top];
            }
        }
        return sum;
    }
}
// @lc code=end

