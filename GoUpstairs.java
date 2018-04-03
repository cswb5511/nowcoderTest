package com.jingdong.www;

/*有n级台阶，一个人每次上一级或者两级，问有多少种走完n级台阶的方法。为了防止溢出，请将结果Mod 1000000007

给定一个正整数int n，请返回一个数，代表上楼的方式数。保证n小于等于100000。

测试样例：
1
返回：1
 * */
public class GoUpstairs {
	 public int countWays(int n) {
         // write code here
	       
	        //生成数组
	        int[] list=new int[100000];
	        list[1]=1;
	        list[2]=2;
	        //不要用递归，因为那样会溢出，要用递推f(x)=f(x-1)+f(x-2)
	        for (int i = 3; i < list.length; i++) {
	        //这里取mod是因为不让int范围的两个数相加溢出
				list[i]=(list[i-1]+list[i-2])%1000000007;
			}
	       
	        
			return list[n];
     
  }
}
