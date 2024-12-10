package com.unit9.test12;

public class Test {
	//将对象作为方法的参数
	public static void feed(Animal animal) {
		System.out.println("饲养员开始喂养动物...");
		animal.eat();
		//instanceof 判断一个对象的真实类型
		if(animal instanceof Cat) {
			Cat c=(Cat)animal;
			c.sleep();
		}
		if(animal instanceof Dog) {
			Dog d=(Dog)animal;
			d.run();
		}
		if(animal instanceof Bird) {
			Bird b=(Bird)animal;
			b.fly();
		}
	}
	

	public static void main(String[] args) {
		Cat cat=new Cat();
		Dog dog=new Dog();
		Bird bird=new Bird();
		
		feed(cat);//传入时，将子类对象转换成了父类对象
		
		//向上转型(自动类型转换)
		Animal animal=new Dog();
		
		//向下转型(强制转换)
		Dog dog2=(Dog)animal;
	}
}
