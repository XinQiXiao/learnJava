import com.unit7.test.Test3_A;//不同包中调用其他类的方法，需要先引入对方类

public class Test3_C {
	/*
		需要调用另一个类的方法时，需要使用对方类的类名或者对象名
	 */
	
	//main方法
	public static void main(String[] args) {
		Test3_A.methodA();
	}

}
