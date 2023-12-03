
/********************************************************************************/
//  LeetCode------->
//  CodeStudio----->
//  GFG------------>https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1#
/********************************************************************************/
import java.util.*;
//  0  1  2  3
// {{1, 0, 0, 0},
// {1, 1, 0, 1}, 
// {1, 1, 0, 0},
// {0, 1, 1, 1}}


// m is the given matrix and n is the order of matrix
class Solution {
    public static boolean isvalid(int newx,int newy,int n){
        if((newx>=0 && newx<=n-1) && (newy>=0 && newy<=n-1))
            return true;
        return false;
    }
    public static void solve(int[][] m, int n, int x, int y, int visited[][], ArrayList<String> ans, String path) {
        if (x == n - 1 && y == n - 1) {
            // if (path.length() > 0)
                ans.add(new String()+path);
            return;
        }
        //make visited
        visited[x][y]=1;
        // left down right top
        int xmove[] = { 0, 1, 0, -1 };
        int ymove[] = { -1, 0, 1, 0 };
        String move[]={"L","D","R","U"};
        for(int i=0;i<4;i++){
            int newx=x+xmove[i];
            int newy=y+ymove[i];
            if(isvalid(newx,newy,n) && m[newx][newy]==1  && visited[newx][newy]!=1){
                path=path+move[i];
                solve(m, n, newx, newy, visited, ans, path);
                path=path.substring(0,path.length()-1);
            }
        }
        visited[x][y]=0;
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> ans = new ArrayList<>();
        if (m[0][0] == 0)
            return ans;

        int visited[][] = new int[n][n];

        // initializing with 0s
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                visited[i][j] = 0;
            }
        }

        String path = "";
        solve(m, n, 0, 0, visited, ans, path);
        // Collections.sort(ans);
        return ans;

    }
}