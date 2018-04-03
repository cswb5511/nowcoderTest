package com.jingdong.www;


/*问题描述：有一个矩阵map，它每个格子有一个权值。从左上角的格子开始每次只能向右或者向下走，最后到达右下角的位置，路径上所有的数字累加起来就是路径和，返回所有的路径中最小的路径和。

给定一个矩阵map及它的行数n和列数m，请返回最小路径和。保证行列数均小于等于100.

测试样例：
[[1,2,3],[1,1,1]],2,3
返回：4
 * */
public class MinimumPath {
	 public int getMin(int[][] map, int n, int m) {
	        // write code here
	        //创建一个新数组dp数组是一个用来存放结果的数组
	        int[][] dp=new int[n][m];
	        //初始化
	        dp[0][0]=map[0][0];
	        //要先算出dp的第一行和第一列，因为走法只能是往下和往右，一点一点累计前面的计算结果
			for (int i = 1; i < dp[0].length; i++) {
				dp[0][i]=map[0][i]+dp[0][i-1];
				
			}
			for (int i = 1; i < dp.length; i++) {
				dp[i][0]=map[i][0]+dp[i-1][0];
			}
			//从上到下从左到右遍历存储
			for (int i = 1; i < n; i++) {
				for (int j = 1; j < m; j++) {
					dp[i][j]=map[i][j]+Math.min(dp[i-1][j], dp[i][j-1]);
				}
			}
			return dp[n-1][m-1]; 
	    }
}