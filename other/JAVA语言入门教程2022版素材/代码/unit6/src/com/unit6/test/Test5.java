package com.unit6.test;

public class Test5 {

	public static void main(String[] args) {
		//2.声明一个数组，将元素逆序输出。
	    int[] nums= {1,34,456,3,54,65};
	    
//	    for(int i=nums.length-1;i>=0;i--) {
//	    	System.out.println(nums[i]);
//	    }
	    
	    int i=nums.length-1; 
	    while(i>=0) {
	    	System.out.println(nums[i]);
	    	i--;
	    }
	    

	}

}
