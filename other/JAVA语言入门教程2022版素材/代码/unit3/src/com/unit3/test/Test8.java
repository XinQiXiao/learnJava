package com.unit3.test;

public class Test8 {

	public static void main(String[] args) {
		int a=2;
		int b=3;
		int c=1;
		
		if(a>=b) {
			if(b>=c) {
				System.out.println(a+"----"+b+"----"+c);
			}else if(c>=b){
				if(a>=c) {
					System.out.println(a+"----"+c+"----"+b);
				}else if(c>=a) {
					System.out.println(c+"----"+a+"----"+b);
				}
			}
		}else if(b>=a) {
			if(a>=c) {
				System.out.println(b+"----"+a+"----"+c);
			}else if(c>=a) {
				if(b>=c) {
					System.out.println(b+"----"+c+"----"+a);
				}else if(c>=b) {
					System.out.println(c+"----"+b+"----"+a);
				}
			}
		}

	}

}
