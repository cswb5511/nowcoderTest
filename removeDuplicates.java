package com.jingdong.www;

public class removeDuplicates {
	 public int removeDuplicates(int[] nums) {
		 	int coutn_1=0;
		 	int coutn_2=0;
		 	int coutn_3=0;
		 	int coutn_4=0;
		 	int coutn_5=0;
		 	int coutn_6=0;
		 	int coutn_7=0;
		 	int coutn_8=0;
		 	int coutn_9=0;
		 	int coutn_0=0;
		 	int count =0;
		 	for (int i = 0; i < nums.length; i++) {
				if(nums[i]==1&&coutn_1<1){
					nums[i]=1;
					coutn_1++;
					count++;
				}else if(nums[i]==2&&coutn_2<1){
					nums[i]=2;
					coutn_2++;
					count++;
				}else if(nums[i]==3&&coutn_3<1){
					nums[i]=3;
					coutn_3++;
					count++;
				}else if(nums[i]==4&&coutn_4<1){
					nums[i]=4;
					coutn_4++;
					count++;
				}else if(nums[i]==5&&coutn_5<1){
					nums[i]=5;
					coutn_5++;
					count++;
				}else if(nums[i]==6&&coutn_6<1){
					nums[i]=6;
					coutn_6++;
					count++;
				}else if(nums[i]==7&&coutn_7<1){
					nums[i]=7;
					coutn_7++;
					count++;
				}else if(nums[i]==8&&coutn_8<1){
					nums[i]=8;coutn_8++;
					count++;
				}else if(nums[i]==9&&coutn_9<1){
					nums[i]=9;
					coutn_9++;
					count++;
				}else if(nums[i]==0&&coutn_0<1){
					nums[i]=0;
					coutn_0++;
					count++;
				}
			}
	        return count;
	    }
}
