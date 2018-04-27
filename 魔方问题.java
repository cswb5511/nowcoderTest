package demo.Thread;
/**
 * 
 * 完美世界实习生练习题
 * 魔方游戏，给n个魔方，每个魔方拼对有对应加分，但是每个魔方也有拼的时间，总共时间不能超过10 求最大分数
 * 第一行多少个魔方
 * 第二行是魔方的得分
 * 第三行是魔方的时间
 * 思路就是采用一个n列2行的数组，分别存放分数和时间，把时间允许的范围内的组合分数都算出来并求出最大值
 * */
import java.util.Scanner;

public class 魔方问题 {
	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] map=new int[n][2];
		for (int i = 0; i < n; i++) {
				map[i][1]=sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			map[i][0]=sc.nextInt();
		}
		int res=0;
		int max=0;
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				if(i==j){
					continue;
				}
				int temp=0;
				if(temp>10){
					break;
				}
				temp=map[i][0]+map[j][0];
				max=map[i][1]+map[j][1];
				res=Math.max(max, res);
			}
		}
		System.out.println(res);
		System.out.println(map.length);
	}
	public static int getMin(int[][] map, int n, int m) {
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
				dp[i][j]=map[i][j]+Math.max(dp[i-1][j], dp[i][j-1]);
			}
		}
		return dp[n-1][m-1]; 
    }
}
