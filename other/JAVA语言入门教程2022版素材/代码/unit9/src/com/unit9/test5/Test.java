package com.unit9.test5;

public class Test {

	public static void main(String[] args) {
		Cat cat=new Cat();
		Dog dog=new Dog();
		Bird bird=new Bird();
		
		cat.run();
		dog.run(1);
		bird.run();
	}
	
	//重载：同一个类中，方法名相同，参数列表不同
	//重写：子类的方法和父类重名     子类重写父类方法

}
