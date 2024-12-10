package com.unit9.test6;

public class Test {

	public static void main(String[] args) {
		Cat cat=new Cat("小黄","黄色",2);
		Dog dog=new Dog("小白","白色",2,"哈士奇");
		Bird bird=new Bird("小黑","黑色",2);
		
		cat.run();
		dog.run();
		bird.run();
	}

}
