package com.jingdong.www;
/**
 * 	数字反转使用String来做，并且考虑int边界条件
 * */
public class Solution {
	public static int isPalindrome(int x) {
		if(x>(Math.pow(2, 32)-1)||x<-Math.pow(2, 32)){
			return 0;
		}
		String str=x+"";
		if(str.contains("-")){
			str=str.substring(1, str.length());
			StringBuffer stringBuffer = new StringBuffer(str);
			StringBuffer reverse = stringBuffer.reverse();
			String string = "-"+reverse.toString();
			return Double.parseDouble(string) <-Math.pow(2, 32)?0:Integer.parseInt(string);
		}
		StringBuffer stringBuffer = new StringBuffer(str);
		StringBuffer reverse = stringBuffer.reverse();
		String string = reverse.toString();
		
			return Double.parseDouble(string)>(Math.pow(2, 32)-1)?0:Integer.parseInt(string);
		
    }
	public static void main(String[] args) {
		System.out.println(isPalindrome(1534236469));
	}
}
