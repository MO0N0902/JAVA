package abstractTest1;

public abstract class ClassB {

	abstract void method1(); //추상메소드가 하나라도 있으면 클래스에도 abstract를 붙여줘야함
	
	
	void method2() {
		System.out.println("추상클래스의 method2 실행");
	}
}
