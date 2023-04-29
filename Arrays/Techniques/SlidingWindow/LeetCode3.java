/*
longest substring without repeating characters

Credit to: https://leetcode.com/problems/longest-substring-without-repeating-characters/solutions/1729/11-line-simple-java-solution-o-n-with-explanation/?orderBy=most_votes

must practice this problem more
*/
import java.util.*; 

class Solution {
    static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max_substring = 0;
        for (int i = 0, j = 0; i < s.length(); i++){
            //if the key exists somewhere else in map, then update j
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }

            //putting string keys into map with corresponding positions as values
            map.put(s.charAt(i), i);

            //updating the max as traversing thru the map
            max_substring = Math.max(max_substring, i - j + 1);
        }

        return max_substring;
    }
}