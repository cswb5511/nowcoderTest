package com.jingdong.www;

import java.util.ArrayList;
import java.util.Scanner;
//
// test  tt
//list
public class FindX {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(findX(str));
	}
	
	public static String findX(String s){
		char[] array = s.toCharArray();
		ArrayList<Character> list=new ArrayList<>();
		int max=(int)array[array.length-1];
		list.add((char)max);
		for (int i =array.length-2 ; i >=0 ; i--) {
			if(array[i]>=max){
				list.add(array[i]);
				max=array[i];
			}
		}
		StringBuffer stringBuffer = new StringBuffer(); 
		for (int i = list.size()-1; i >=0 ; i--) {
			stringBuffer.append(list.get(i));
		}
		return stringBuffer.toString();
	}
}
