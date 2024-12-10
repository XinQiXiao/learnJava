package com.unit7.test;

public class Test2 {
	//public:在整个项目中都可以调用这个方法
	//static:静态方法，可以直接调用的方法
	//void:没有返回值
	//方法被定义后，只有调用才会执行
	public static void myFirstMethod() {
		System.out.println("方法被执行了！");
	}

	public static void main(String[] args) {
		for(int i=0;i<1000;i++) {
			myFirstMethod();
		}
	}

}
