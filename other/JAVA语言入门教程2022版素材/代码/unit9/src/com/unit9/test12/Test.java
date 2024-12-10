package com.unit9.test12;

public class Test {
	//��������Ϊ�����Ĳ���
	public static void feed(Animal animal) {
		System.out.println("����Ա��ʼι������...");
		animal.eat();
		//instanceof �ж�һ���������ʵ����
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
		
		feed(cat);//����ʱ�����������ת�����˸������
		
		//����ת��(�Զ�����ת��)
		Animal animal=new Dog();
		
		//����ת��(ǿ��ת��)
		Dog dog2=(Dog)animal;
	}
}
