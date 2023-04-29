/*

minimum size subarray sum

Credit: https://leetcode.com/problems/minimum-size-subarray-sum/solutions/59078/accepted-clean-java-o-n-solution-two-pointers/?orderBy=most_votes

This discussion thread has more replies with good explanations. 

*/
class LeetCode209{
    public int minSubArrayLen(int target, int[] nums) {
        int size = nums.length;
        if (size == 0)
            return 0;

        // two pointers, i and j
        int i = 0;
        int j = 0;
        int sum = 0;
        int min_length = Integer.MAX_VALUE;

        while (j < size){
            sum = sum + nums[j++];

            while (sum >= target){
                min_length = Math.min(min_length, j - i);
                sum = sum - nums[i++];
            }
        }
        if (min_length == Integer.MAX_VALUE)
          return 0;
        else
          return min_length;
    }
}