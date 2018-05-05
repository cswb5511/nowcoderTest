package demo.Thread;
/**编写一个程序，将输入字符串中的字符按如下规则排序。

规则 1 ：英文字母从 A 到 Z 排列，不区分大小写。

       如，输入： Type   输出： epTy

规则 2 ：同一个英文字母的大小写同时存在时，按照输入顺序排列。

     如，输入： BabA   输出： aABb

规则 3 ：非英文字母的其它字符保持原来的位置。

     如，输入： By?e   输出： Be?y

样例：

    输入：

   A Famous Saying: Much Ado About Nothing(2012/8).

    输出：

   A  aaAAbc   dFgghh :  iimM   nNn   oooos   Sttuuuy  (2012/8).

本题思路：
	一开始想着先把大写和小写分别放一个list然后排序即可，用另外一个外部指针描述递增，然后插回到原位置
	但是这样就无法保证题目描述里面的按照输入顺序写入，这样只能用一个新的队列来挨个扫描整个字符串谁先
	出现就先进入队列，只需要保证每次扫描扫描一个字符就行不区分大小写。
	最后再扫描一遍非字母的字符，插入到原来非字符的位置即可。这里只需要记录一下当时的索引即可
	这样也没有破坏原来的数据结构
 * */
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;
//
//
//
//public class Main {
//
//	public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//			while(sc.hasNext()){
//				String str=sc.nextLine();
//				char[] strarr = str.toCharArray();
//				ArrayList<Integer> big=new ArrayList<>();
//				ArrayList<Character> bigzimu=new ArrayList<>();
////				ArrayList<Character> smallzimu=new ArrayList<>();
//			
//				for (int i = 0; i < strarr.length; i++) {
//					if(strarr[i]-'0'<='z'-'0'&&strarr[i]-'0'>='A'-'0'){
//						big.add(i);
//						bigzimu.add(strarr[i]);
//					}
//					
//				}
//				Collections.sort(bigzimu);
//				
//				int countbig=0;
//				
//				for (int i = 0; i < strarr.length; i++) {
//					if(strarr[i]-'0'<='z'-'0'&&strarr[i]-'0'>='A'-'0'){
//						strarr[i]=bigzimu.get(countbig);
//						countbig++;
//					}
//					
//				}
//				String s="";
//				for (Character j : strarr) {
//					s+=j;
//				}
//				System.out.println(s);
//			}
//	}
//
//}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
    
public class 字符串排序{
   public static void main(String[] args)throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str=bf.readLine()) != null){
            StringBuffer sb = new StringBuffer();
            //从A-Z、a-z直接记录字母先
            for(int i=0; i<26; i++){
                char c = (char)(i+'A');//遍历循环从A开始不分大小写，将字母部分依次写进去
                for(int j=0; j<str.length(); j++){
                    char sc = str.charAt(j);
                    if(c == sc || c == sc -32)
                        sb.append(sc);
                }
            }
            //然后记录非字母字符
            for(int i=0; i<str.length(); i++){
                char c = str.charAt(i);
                if(!(c >= 'a' && c <='z') && !(c >= 'A' && c <= 'Z'))
                    sb.insert(i,c);
            }
            System.out.println(sb.toString());
        }
        bf.close();
    }
}
