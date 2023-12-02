/********************************************************************************/
//  LeetCode------->https://leetcode.com/problems/subsets/submissions/
//  CodeStudio----->https://www.codingninjas.com/studio/problems/subsequences-of-string_985087?leftPanelTab=1&utm_source=youtube&utm_medium=affiliate&utm_campaign=love_babbar_16&leftPanelTabValue=SUBMISSION
/********************************************************************************/

// if you want to add list inside list  (at time of adding we are creating new arraylist because 
// that list contains refrance it is changing)
// list.add(new ArryList(sub));

import java.util.*;

class Solution {
    public void solve(int[] nums, List<Integer> sub, int indx, List<List<Integer>> ans) {
        if (indx >= nums.length) {
            ans.add(new ArrayList<>(sub));
            return;
        }
        // exclude
        solve(nums, sub, indx + 1, ans);
        // include
        sub.add(nums[indx]);
        solve(nums, sub, indx + 1, ans);
        sub.remove(sub.size() - 1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        int i = 0;
        List<Integer> sub = new ArrayList<>();
        solve(nums, sub, i, ans);
        return ans;
    }
}