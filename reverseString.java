package com.jingdong.www;

import java.util.Arrays;

public class reverseString {
	public static String reverseString(String s) {
		char[] array = s.toCharArray();
		int i=0;
		int j=s.length();
		while(i<j){
			char temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			i++;
			j--;
		}
		return new String(array);
    }
	public static void main(String[] args) {
		System.out.println(reverseString("hello"));
	}
}
