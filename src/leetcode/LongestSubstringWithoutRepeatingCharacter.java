package leetcode;

/*
* 3. Longest Substring Without Repeating Characters
Medium
Given a string s, find the length of the longest substring without repeating characters.
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

Example 4:
Input: s = ""
Output: 0

Constraints:
0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
* */
public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) throws Exception {
        int length = lengthOfLongestSubstring("aab");
        System.out.println(length);
    }

    /*
     * 1、从第一个开始循环，到相同的停止，截取中间字段
     * 2、下一个继续截取，循环
     * 3、最后比较这些字段那个长度最长
     *
     * 1、不用截取字段，直接数个数就可以了
     * 2、遇到相同字母直接停止
     * 3、继续下次循环
     * pwwkew
     * abcabcbb
     * aab
     * */
    public static int lengthOfLongestSubstring(String s) throws Exception {
        if (s.isEmpty()) return 0;
        if (s.length()==1) return 1;
        int current = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j-i >= current) {
                        current = j-i;
                        break;
                    }
                }
            }
            if (current==0 && i==s.length()-1){
                return s.length();
            }
        }
        return current;
    }
}
