/********************************************************************************/
//  LeetCode------->https://leetcode.com/problems/subsets/submissions/
//  CodeStudio----->https://www.codingninjas.com/studio/problems/subsequences-of-string_985087?leftPanelTab=1&utm_source=youtube&utm_medium=affiliate&utm_campaign=love_babbar_16&leftPanelTabValue=SUBMISSION
/********************************************************************************/

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

//i made changes  erase

class Solution {

    public static void solve(String str,ArrayList<String> ans,String sub,int i){
        if(i>=str.length()){
            if(sub.length()>0)
                ans.add(sub);
            return;
        }
        //exclude
        solve(str,ans,sub,i+1);
        //include
        sub=sub+str.charAt(i);
        solve(str, ans, sub, i+1);
        
    }
    public static ArrayList<String> subsequences(String str) {
        ArrayList<String> ans=new ArrayList<>();
        String sub="";
        int i=0;
        solve(str,ans,sub,i);
        return ans;
    }
}

