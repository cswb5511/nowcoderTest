package com.jingdong.www;

public class removeDuplicates {
	 public int removeDuplicates(int[] nums) {
		 	if(nums.length==0||nums==null){
		 		return 0;
		 	}
		 	int index=1;
		 	for (int i = 1; i < nums.length; i++) {
				if(nums[i]!=nums[i-1]){
					nums[index]=nums[i];
					index++;
				}
			}
		 	return index;
	    }
}
