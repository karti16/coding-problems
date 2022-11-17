/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
import java.util.*;
class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> pair = new HashMap<>();
        pair.put(')', '(');
        pair.put(']', '[');
        pair.put('}', '{');

        ArrayList<Character> temp = new ArrayList<>();

        for (char ch : s.toCharArray()) {
            if(pair.containsKey(ch)) {
                    if (!temp.isEmpty() && pair.get(ch) == temp.get(temp.size() - 1)) {
                    temp.remove(temp.size() - 1);
                }else{
                        return false;
                } 
            }else{
                temp.add(ch);
            }
        }
        return temp.isEmpty();
    }
}
// @lc code=end

