/*
minimum window substring

Credit to: https://leetcode.com/problems/minimum-window-substring/solutions/26810/java-solution-using-two-pointers-hashmap/comments/1260303

and

https://leetcode.com/problems/minimum-window-substring/solutions/26810/java-solution-using-two-pointers-hashmap/

Easy and short solution, need to revisit to practice more.
*/

class Solution {
    public String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();
        if ( m < n || m == 0)
             return "";

        int[] map = new int[128];
        for (int i = 0; i < n; i++) 
            map[t.charAt(i)]++;
        
        int count = 0;
        int i = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;
        int si = -1;
        while (j < m) {
            if (map[s.charAt(j++)]-- > 0) 
                count++; //
            while (count == n) {
                if (j - i < min) {
                    min = j - i;
                    si = i;
                }
                if (++map[s.charAt(i++)] > 0) 
                    count--;
            }
        }
        if (si == -1)
            return "";
        else
            return s.substring(si, si + min);
    }
}